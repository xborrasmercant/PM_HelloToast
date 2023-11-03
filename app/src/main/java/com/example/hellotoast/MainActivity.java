package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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