package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {
    ArrayList<String> descriptions = new ArrayList<>();
    TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescription);
        descriptions.add("You have clicked Item 1");
        descriptions.add("You have clicked Item 2");
        descriptions.add("You have clicked Item 3");
    }

    @Override
    public void onItemSelected(int index) {
        System.out.println("in: "+ index + " " + descriptions.get(index));
        tvDescription.setText(descriptions.get(index));
    }
}