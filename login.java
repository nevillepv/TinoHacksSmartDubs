package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {
    private FireBaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mAuth =

    }
    public void sendMessage(View view) {
        Intent in = new Intent(this, team.class);
        startActivity(in);

    }
}
