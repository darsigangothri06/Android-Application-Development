package com.example.app5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btActivity2, btActivity3;
    EditText etName;
    TextView tvResult;
    final int ACTIVITY3 = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        btActivity2 = findViewById(R.id.btSubmit);
        btActivity3 = findViewById(R.id.btActivity3);
        tvResult = findViewById(R.id.tvResult);

        btActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty())
                    Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                {
                    String name = etName.getText().toString().trim();

                    // Explicit Intent
                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        btActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Activity3.class);
                startActivityForResult(intent,ACTIVITY3);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ACTIVITY3)
        {
            if(resultCode == RESULT_OK)
            {
                tvResult.setText(data.getStringExtra("surname"));
            }

            if(resultCode == RESULT_CANCELED)
            {
                tvResult.setText("No Data received");
            }
        }
    }
}