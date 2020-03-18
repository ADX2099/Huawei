package com.adx2099.huaweitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button calculate;
    private EditText varA, varB;
    private TextView TextViewResult;
    private int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();


    }

    private void setUpView() {
        varA = findViewById(R.id.editTextNumberA);
        varB = findViewById(R.id.editTextNumberB);
        TextViewResult = findViewById(R.id.resultText);
        calculate = findViewById(R.id.button);
        calculate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                sumNumbers();
                break;
        }
    }

    private void sumNumbers() {
        int a = Integer.parseInt(varA.getText().toString());
        int b = Integer.parseInt(varB.getText().toString());
        total = a + b;
        String theResult = String.valueOf(total);
        TextViewResult.setText(theResult);
    }
}
