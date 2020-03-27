package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// IT18233704 N.R Yamasinghe
public class SecondActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView answer;
    Button plusButton, minusButton, multiplyButton, divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Hooks
        number1 = findViewById(R.id.inputField1);
        number2 = findViewById(R.id.inputField2);
        answer = findViewById(R.id.answer);
        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        divideButton = findViewById(R.id.divisionButton);
        multiplyButton = findViewById(R.id.multiplyButton);

        // Get the intent
        Intent intent = getIntent();

        // Get the values passed to the intent as extras
        final String num1 = intent.getStringExtra("number1");
        final String num2 = intent.getStringExtra("number2");

//        final int n1 = Integer.parseInt(num1);
//        final int n2 = Integer.parseInt(num2);
        final double n1 = Integer.parseInt(num1);
        final double n2 = Integer.parseInt(num2);


        number1.setText(num1);
        number2.setText(num2);


        // Plus button listener
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1 + n2;
                answer.setText(num1 + " + " + num2 + " = " + value);
            }
        });


        // Minus button listener
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1 - n2;
                answer.setText(num1 + " - " + num2 + " = " + value);
            }
        });


        // Multiply mutton listener
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1 * n2;
                answer.setText(num1 + " * " + num2 + " = " + value);
            }
        });


        // Divide button listener
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1 / n2;
                answer.setText(num1 + " / " + num2 + " = " + value);
            }
        });
    }
}
