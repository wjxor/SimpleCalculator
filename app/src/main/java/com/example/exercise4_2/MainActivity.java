package com.example.exercise4_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView tvResult;
    String num1, num2, SResult;
    double result = 0.0;


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
        btnRem = (Button) findViewById(R.id.btnRem);

        tvResult = (TextView) findViewById(R.id.tvResult);

        // 덧셈 기능
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();

                // 입력창이 비어있으면 경고문구 발생
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);

                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });

        // 뺼셈 기능
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();

                // 입력창이 비어있으면 경고문구 발생
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);

                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });

        // 곱셈 기능
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();

                // 입력창이 비어있으면 경고문구 발생
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하세요!", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);

                    tvResult.setText("계산 결과 : " + result);
                }
            }
        });

        // 나눗셈 기능
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();

                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    // 입력창이 비어있으면 경고문구 발생
                    if (num1.isEmpty() || num2.isEmpty()) {
                        Toast.makeText(getApplicationContext(), "숫자를 입력하세요!", Toast.LENGTH_SHORT).show();
                    } else {

                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        SResult = String.format("%.2f", result);

                        tvResult.setText("계산 결과 : " + SResult);
                    }
                }
            }
        });

        // 나머지 기능
        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edNum1.getText().toString();
                num2 = edNum2.getText().toString();

                if (num2.equals("0")) {
                    Toast.makeText(getApplicationContext(), "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    // 입력창이 비어있으면 경고문구 발생
                    if (num1.isEmpty() || num2.isEmpty()){
                        Toast.makeText(getApplicationContext(), "숫자를 입력하세요!", Toast.LENGTH_SHORT).show();
                    } else {
                        // 굳이 실수값이 나올 필요가 없기 떄문에 정수로 나오게 하였다.
                        result = Integer.parseInt(num1) % Integer.parseInt(num2);

                        tvResult.setText("계산 결과 : " + (int) result);
                    }
                }
            }
        });
    }
}