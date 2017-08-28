package com.apkglobal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_num1, et_num2;
    Button btn_add, btn_subtract, btn_multiply, btn_divide,btn_clear;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        et_num1=(EditText)findViewById(R.id.et_num1);
        btn_clear=(Button)findViewById(R.id.btn_clear);
        et_num2=(EditText)findViewById(R.id.et_num2);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_subtract=(Button)findViewById(R.id.btn_subtract);
        btn_divide=(Button)findViewById(R.id.btn_divide);
        btn_multiply=(Button)findViewById(R.id.btn_multiply);
        result=(TextView) findViewById(R.id.result);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et_num1.getText().length()>0) && (et_num2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(et_num1.getText().toString());
                    double oper2 = Double.parseDouble(et_num2.getText().toString());
                    double tresult = oper1 + oper2;
                    result.setText(Double.toString(tresult));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et_num1.getText().length()>0) && (et_num2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(et_num1.getText().toString());
                    double oper2 = Double.parseDouble(et_num2.getText().toString());
                    double tresult = oper1 / oper2;
                    result.setText(Double.toString(tresult));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et_num1.getText().length()>0) && (et_num2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(et_num1.getText().toString());
                    double oper2 = Double.parseDouble(et_num2.getText().toString());
                    double tresult = oper1 * oper2;
                    result.setText(Double.toString(tresult));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((et_num1.getText().length()>0) && (et_num2.getText().length()>0))
                {
                    double oper1 = Double.parseDouble(et_num1.getText().toString());
                    double oper2 = Double.parseDouble(et_num2.getText().toString());
                    double tresult = oper1 - oper2;
                    result.setText(Double.toString(tresult));
                }
                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Enter The Required Numbers",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_num1.setText("");
                et_num2.setText("");
                result.setText("0.00");
                et_num1.requestFocus();
            }
        });

    }
}
