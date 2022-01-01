package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    EditText etChirps;
    Button btResult;
    TextView tvResult;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChirps = findViewById(R.id.etChirps);
        btResult = findViewById(R.id.btResult);
        tvResult = findViewById(R.id.tvResult);

        formatter = new DecimalFormat("#0.0");

        tvResult.setVisibility(View.GONE);

        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etChirps.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Enter all feilds", Toast.LENGTH_LONG).show();
                else
                {
                    int chirps = Integer.parseInt(etChirps.getText().toString().trim());
                    double temp = (chirps / 3.0) + 4;
                    String res = "The approximate temperature outside is " + formatter.format(temp) + " degrees Celcius.";
                    tvResult.setText(res);
                    tvResult.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}