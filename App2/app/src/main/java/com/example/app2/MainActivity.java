package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etID;
    Button btSubmit;
    TextView tvResult;
    String currYear, college, eType, branch, Sname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // connecting variables
        etID = findViewById(R.id.etID);
        btSubmit = findViewById(R.id.btSubmit);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);

        // when user clicks on submit button, we want to get whatever he typed.

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // trim() is used to trim trailing/leading spaces
                String idNumber = etID.getText().toString().trim();

                int year = Integer.parseInt(idNumber.substring(0,2));
                String CC = idNumber.substring(2,4);
                String entryType = idNumber.substring(4,6);
                int branchCode = Integer.parseInt(idNumber.substring(6,8));
                String rollNum = idNumber.substring(8,10);

                // Year
                if(year == 20)
                    currYear = "Second Year";
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Year", Toast.LENGTH_SHORT).show();
                    return;
                }

                // College
                if(CC.equals("JR"))
                    college = "KITS";
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid College", Toast.LENGTH_SHORT).show();
                    return;
                }

                // EntryType
                if(entryType.equals("1A"))
                    eType = "Regular Entry";
                else
                    eType = "Lateral Entry";

                // Branch code
                if(branchCode == 43)
                    branch = "CAI";
                else
                {
                    Toast.makeText(MainActivity.this, "Your are not from AI", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Roll number
                if(rollNum.equals("06"))
                {
                    Sname = "Darsi Gangothri";
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid Name", Toast.LENGTH_SHORT).show();
                    return;
                }

                tvResult.setText("Year: " + currYear + '\n' + "College Code: " + college + '\n' + "Entry Type: " + eType + '\n' + "Branch: " + branch + '\n' + "Roll number: 6" + '\n' + "Name: " + Sname);
                tvResult.setVisibility(View.VISIBLE);
            }
        });
    }
}