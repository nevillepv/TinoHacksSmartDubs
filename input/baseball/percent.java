package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class percent extends AppCompatActivity {

    private String mTextMessage;
    private double percentage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent);
        mTextMessage = team.teamName;
        TextView myAwesomeTextView = (TextView)findViewById(R.id.Team);
        myAwesomeTextView.setText(mTextMessage);
    }

    public void sendMessage(View view) {
        Intent in = new Intent(this, team.class);
        startActivity(in);
    }

}
