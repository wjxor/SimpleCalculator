package com.example.exercise4_2;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView tvResult;
    String num1, num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("간단한 계산기");

        edNum1 = (EditText) findViewById(R.id.edNum1);
        edNum2 = (EditText) findViewById(R.id.edNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnDiv = (Button) findViewById(R.id.btnDiv);

        tvResult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                tvResult.setText("계산 결과 : " + result.toString());


                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvResult.setText("계산 결과 : " + result.toString());


                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                tvResult.setText("계산 결과 : " + result.toString());


                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                tvResult.setText("계산 결과 : " + result.toString());


                return false;
            }
        });
    }




}