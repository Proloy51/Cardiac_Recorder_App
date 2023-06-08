package com.example.cardiacrecorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class add_data extends AppCompatActivity {

    private Button uploadbutton;
    private EditText dom,tom,sysp,diasp,hr,cmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        uploadbutton = findViewById(R.id.uploadid);

        dom = findViewById(R.id.titleid);
        tom = findViewById(R.id.descid);
        sysp = findViewById(R.id.systolicpressureid);
        diasp = findViewById(R.id.diastolicpressureid);
        hr = findViewById(R.id.heartrateid);
        cmt = findViewById(R.id.commentid);



        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dateom,timeom,systolic,diastolic,heartrate,comment;
                dateom = dom.getText().toString().trim();
                timeom = tom.getText().toString().trim();
                systolic = sysp.getText().toString().trim();
                diastolic = diasp.getText().toString().trim();
                heartrate = hr.getText().toString().trim();
                comment = cmt.getText().toString().trim();
                Intent intent = new Intent(add_data.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}