package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvWelcome = findViewById(R.id.tvWelcome);

        String name = getIntent().getStringExtra("name");
        tvWelcome.setText("Hey, " + name + " Welcome to Activity 2");
    }
}