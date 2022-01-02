package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ThirdActivity extends AppCompatActivity {
    ImageView ivSet, ivDail, ivWeb, ivLoc;
    Button btnCreateCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ivSet = findViewById(R.id.ivSet);
        ivDail = findViewById(R.id.ivDail);
        ivWeb = findViewById(R.id.ivWeb);
        ivLoc = findViewById(R.id.ivLoc);
        btnCreateCon = findViewById(R.id.btnCreateCon);

        ivSet.setVisibility(View.GONE);
        String mood = getIntent().getStringExtra("expr");
        String dail = getIntent().getStringExtra("number");
        String web = getIntent().getStringExtra("website");
        String loc = getIntent().getStringExtra("location");

        if(mood.equals("happy"))
        {
            ivSet.setImageResource(R.drawable.happyface);
        }
        else if(mood.equals("neutral"))
        {
            ivSet.setImageResource(R.drawable.neutral);
        }
        else
        {
            ivSet.setImageResource(R.drawable.ic_round_sentiment_dissatisfied_24);
        }

        ivSet.setVisibility(View.VISIBLE);
        btnCreateCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ivDail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + dail));
                startActivity(intent);
            }
        });

        ivWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(intent);
            }
        });

        ivLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + loc));
                startActivity(intent);
            }
        });

    }
}