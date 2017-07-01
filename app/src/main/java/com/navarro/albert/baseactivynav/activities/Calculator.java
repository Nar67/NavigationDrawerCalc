package com.navarro.albert.baseactivynav.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.navarro.albert.baseactivynav.BaseActivity;
import com.navarro.albert.baseactivynav.R;

import org.w3c.dom.Text;

public class Calculator extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "MainActivty";
    TextView calc_text;
    Button calc_one, calc_two, calc_three, calc_four, calc_five, calc_six, calc_seven, calc_eight, calc_nine, calc_zero;
    Button calc_div, calc_mult, calc_subs, calc_sum, calc_equal, calc_coma, calc_ac;

    private float result, op_a, op_b;
    private String textFirstOp = "";
    private String textSecondOp = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        calc_text = (TextView) findViewById(R.id.text_calc);
        calc_zero = (Button) findViewById(R.id.calc_zero);
        calc_one = (Button) findViewById(R.id.calc_one);
        calc_two = (Button) findViewById(R.id.calc_two);
        calc_three = (Button) findViewById(R.id.calc_three);
        calc_four = (Button) findViewById(R.id.calc_four);
        calc_five = (Button) findViewById(R.id.calc_five);
        calc_six = (Button) findViewById(R.id.calc_six);
        calc_seven = (Button) findViewById(R.id.calc_seven);
        calc_eight = (Button) findViewById(R.id.calc_eight);
        calc_nine = (Button) findViewById(R.id.calc_nine);
        calc_div = (Button) findViewById(R.id.calc_div);
        calc_mult = (Button) findViewById(R.id.calc_mult);
        calc_subs = (Button) findViewById(R.id.calc_subs);
        calc_sum = (Button) findViewById(R.id.calc_sum);
        calc_equal = (Button) findViewById(R.id.calc_equals);
        calc_coma = (Button) findViewById(R.id.calc_coma);
        calc_ac = (Button) findViewById(R.id.calc_AC);
        setSupportActionBar(toolbar);

        calc_zero.setOnClickListener(this);
        calc_one.setOnClickListener(this);
        calc_two.setOnClickListener(this);
        calc_three.setOnClickListener(this);
        calc_four.setOnClickListener(this);
        calc_five.setOnClickListener(this);
        calc_six.setOnClickListener(this);
        calc_seven.setOnClickListener(this);
        calc_eight.setOnClickListener(this);
        calc_nine.setOnClickListener(this);
        calc_div.setOnClickListener(this);
        calc_mult.setOnClickListener(this);
        calc_subs.setOnClickListener(this);
        calc_sum.setOnClickListener(this);
        calc_equal.setOnClickListener(this);
        calc_coma.setOnClickListener(this);
        calc_ac.setOnClickListener(this);
    }

    @Override
    protected int whatIsMyId() {
        return R.layout.activity_calculator;
    }

    private void setText(String text){
        Log.v(TAG, text);
        calc_text.setText(text);
    }
    private float parse_calc(String text){
        if(text.length() != 0) {
            return Float.parseFloat(text);
        }
        return 0;
    }

    @Override
    public void onClick(View view) {
        String showed_text = calc_text.getText().toString();
        boolean firstOp = true;
        switch (view.getId()) {
            case R.id.calc_zero:
                if(firstOp){
                    textFirstOp += "0";
                }
                else{
                    textSecondOp += "0";
                }
                setText(showed_text+"0");
                break;
            case R.id.calc_one:
                if(firstOp){
                    textFirstOp += "1";
                }
                else{
                    textSecondOp += "1";
                }
                setText(showed_text+"1");
                break;
            case R.id.calc_two:
                if(firstOp){
                    textFirstOp += "2";
                }
                else{
                    textSecondOp += "2";
                }
                setText(showed_text+"2");
                break;
            case R.id.calc_three:
                if(firstOp){
                    textFirstOp += "3";
                }
                else{
                    textSecondOp += "3";
                }
                setText(showed_text+"3");
                break;
            case R.id.calc_four:
                if(firstOp){
                    textFirstOp += "4";
                }
                else{
                    textSecondOp += "4";
                }
                setText(showed_text+"4");
                break;
            case R.id.calc_five:
                if(firstOp){
                    textFirstOp += "5";
                }
                else{
                    textSecondOp += "5";
                }
                setText(showed_text+"5");
                break;
            case R.id.calc_six:
                if(firstOp){
                    textFirstOp += "6";
                }
                else{
                    textSecondOp += "6";
                }
                setText(showed_text+"6");
                break;
            case R.id.calc_seven:
                if(firstOp){
                    textFirstOp += "7";
                }
                else{
                    textSecondOp += "7";
                }
                setText(showed_text+"7");
                break;
            case R.id.calc_eight:
                if(firstOp){
                    textFirstOp += "8";
                }
                else{
                    textSecondOp += "8";
                }
                setText(showed_text+"8");
                break;
            case R.id.calc_nine:
                if(firstOp){
                    textFirstOp += "9";
                }
                else{
                    textSecondOp += "9";
                }
                setText(showed_text+"9");
                break;
            case R.id.calc_div:
                setText(showed_text+"÷");
                break;
            case R.id.calc_mult:
                setText(showed_text+"x");
                break;
            case R.id.calc_subs:
                setText(showed_text+"-");
                break;
            case R.id.calc_sum:
                if(firstOp)
                    firstOp = false;
                setText(showed_text+"+");
                break;
            case R.id.calc_equals:
                Log.v(TAG, "A: "+textFirstOp);
                Log.v(TAG, "B: " + textFirstOp);
                Log.v(TAG, "Res: " + result);
                op_a = parse_calc(textFirstOp);
                op_b = parse_calc(textSecondOp);
                result = op_a + op_b;
                setText(String.valueOf(result));
                break;
            case R.id.calc_coma:
                setText(showed_text+".");
                break;
            case R.id.calc_AC:
                textFirstOp = "";
                textSecondOp = "";
                setText("");
        }
    }
}
