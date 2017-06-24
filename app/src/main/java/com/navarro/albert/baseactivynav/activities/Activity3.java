package com.navarro.albert.baseactivynav.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

public class Activity3 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        setTitle("Activity3");
        setItemChecked();
    }

    @Override
    protected int whatIsMyId() {
        return R.id.activity2;
    }
}
