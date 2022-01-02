package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView ivPic, ivBeach, ivCake, ivBuild;
    Button btnChange;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivPic = findViewById(R.id.ivPic);
        btnChange = findViewById(R.id.btnChange);
        tvResult = findViewById(R.id.tvResult);
        ivCake = findViewById(R.id.ivCake);
        ivBeach = findViewById(R.id.ivBeach);
        ivBuild = findViewById(R.id.ivBuild);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivPic.setImageResource(R.drawable.cake);
            }
        });

        ivCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("Cake is Selected");
            }
        });

        ivBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("Build is selected");
            }
        });

        ivBeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResult.setText("Beach is selected");
            }
        });

    }
}