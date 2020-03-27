package com.example.intentsproj;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// IT18233704 N.R Yamasinghe
public class FirstActivity extends AppCompatActivity {

    Button okButton;
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        // Hooks
        okButton = findViewById(R.id.okButton);
        number1 = findViewById(R.id.inputField1);
        number2 = findViewById(R.id.inputField2);


        // Set ok button on click listener
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("number1", number1.getText().toString());
                intent.putExtra("number2", number2.getText().toString());
                startActivity(intent); // Start the intent
                Context context = getApplicationContext();
                //The context to use
                CharSequence message = "You just clicked the OK button";
                //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }
        });
    }
}
