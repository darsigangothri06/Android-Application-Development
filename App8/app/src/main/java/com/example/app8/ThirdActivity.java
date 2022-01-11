package com.example.app8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class ThirdActivity extends AppCompatActivity {
    ImageView ivSet, ivDail, ivWeb, ivLoc, contactImage;
    Button btnCreateCon, btnSet;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ivSet = findViewById(R.id.ivSet);
        ivDail = findViewById(R.id.ivDail);
        ivWeb = findViewById(R.id.ivWeb);
        ivLoc = findViewById(R.id.ivLoc);
        btnCreateCon = findViewById(R.id.btnCreateCon);
        tvName = findViewById(R.id.tvName);
        btnSet = findViewById(R.id.btnSet);

        tvName.setVisibility(View.GONE);
        ivSet.setVisibility(View.GONE);
        String name = getIntent().getStringExtra("name").toUpperCase();
        String mood = getIntent().getStringExtra("expr");
        String dail = getIntent().getStringExtra("number");
        String web = getIntent().getStringExtra("website");
        String loc = getIntent().getStringExtra("location");
        String email = getIntent().getStringExtra("email");

        tvName.setText("Creating a new contact for \n" + name);

        tvName.setVisibility(View.VISIBLE);
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

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://" + web));
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

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                Intent intent = new Intent(Intent.ACTION_EDIT);
                intent.setType("vnd.android.cursor.item/event");
                intent.putExtra("beginTime", cal.getTimeInMillis());
                intent.putExtra("allDay", false);
                intent.putExtra("rrule", "FREQ=DAILY");
                intent.putExtra("endTime", cal.getTimeInMillis()+60*60*60*60*60*1000);
                intent.putExtra("title", name + "'s Birthday");
                startActivityForResult(intent,1);
            }
        });
        btnCreateCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactIntent = new Intent(ContactsContract.Intents.Insert.ACTION) ;
                contactIntent.setType(ContactsContract.RawContacts.CONTENT_TYPE) ;
                contactIntent.putExtra(ContactsContract.Intents.Insert.NAME , name);
                contactIntent.putExtra(ContactsContract.Intents.Insert.PHONE, dail) ;
                contactIntent.putExtra(ContactsContract.Intents.Insert.EMAIL, email);
                startActivityForResult(contactIntent,1);
            }
        });

    }
}