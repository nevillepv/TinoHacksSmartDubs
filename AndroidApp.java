package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;

public class AndroidApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app);

    }

    public void sendMessage(View view)  {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}
