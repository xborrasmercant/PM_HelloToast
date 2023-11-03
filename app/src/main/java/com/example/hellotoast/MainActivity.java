package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toastButton;
    private Button countButton;
    private TextView countNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastButton = findViewById(R.id.toast_button);
        countButton = findViewById(R.id.count_button);
        countNumber = (TextView) findViewById(R.id.count_number);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "Current number is " + countNumber.getText().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, message, duration).show();
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt((String) countNumber.getText());

                number++;

                countNumber.setText(Integer.toString(number));
            }
        });
    }
}