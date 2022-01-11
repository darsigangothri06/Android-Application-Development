package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText etName, etNumber, etWebsite,etLocation, etEmail;
    ImageView ivHappy,ivNeutral,ivSad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);
        etWebsite = findViewById(R.id.etWebsite);
        etLocation = findViewById(R.id.etLocation);
        etEmail = findViewById(R.id.etEmail);

        ivHappy = findViewById(R.id.ivHappy);
        ivNeutral = findViewById(R.id.ivNeutral);
        ivSad = findViewById(R.id.ivSad);

        ivHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty())
                    Toast.makeText(SecondActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                {
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();
                    String email = etEmail.getText().toString().trim();

                    Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("website",website);
                    intent.putExtra("location",location);
                    intent.putExtra("email",email);
                    intent.putExtra("expr","happy");
                    startActivity(intent);
                }
            }
        });

        ivNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty())
                    Toast.makeText(SecondActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                {
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();

                    Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("website",website);
                    intent.putExtra("location",location);
                    intent.putExtra("expr","neutral");
                    startActivity(intent);
                }
            }
        });

        ivSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().isEmpty() || etNumber.getText().toString().isEmpty())
                   Toast.makeText(SecondActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                {
                    String name = etName.getText().toString().trim();
                    String number = etNumber.getText().toString().trim();
                    String website = etWebsite.getText().toString().trim();
                    String location = etLocation.getText().toString().trim();

                    Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                    intent.putExtra("name",name);
                    intent.putExtra("number",number);
                    intent.putExtra("website",website);
                    intent.putExtra("location",location);
                    intent.putExtra("expr","sad");
                    startActivity(intent);
                }
            }
        });
    }
}