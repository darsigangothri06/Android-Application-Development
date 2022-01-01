package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    Button btSubmit;
    EditText etSurname1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        etSurname1 = findViewById(R.id.etSurname1);
        btSubmit = findViewById(R.id.btSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etSurname1.getText().toString().isEmpty())
                    Toast.makeText(Activity3.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                else
                {
                    String surname = etSurname1.getText().toString().trim();
                    Intent intent = new Intent();
                    intent.putExtra("surname",surname);
                    setResult(RESULT_OK,intent);
                    Activity3.this.finish();
                }
            }
        });
    }
}