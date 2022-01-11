package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCreate;
    TextView tvInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreate = findViewById(R.id.btnCreate);
        tvInstructions = findViewById(R.id.tvInstructions);

        String text = "You can\n \n 1. Add Name\n 2. Add Number\n 3. Add Email (Optional)\n 4. Add Website(Optional)\n 5. Add Location(Optional)\n 6. Add Birthday"
                + "\n 7. Set Remainder on birthday";
        tvInstructions.setText(text);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                    }
                });
    }
}