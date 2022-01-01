package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Action: ", "In onCreate: ");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Action: ", "In onStart: ");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Action: ", "In onResume: ");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Action: ", "In onPause: ");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Action: ", "In onStop: ");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Action: ", "In onDestroy: ");
    }

    @Override
    public void onRestart()
    {
        super.onRestart();
        Log.d("Action: ", "In onRestart: ");
    }
}