package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class team extends AppCompatActivity {
    public String teamName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    public void sendMessage(View view){
        Intent in = new Intent(this, percent.class);
        startActivity(in);
        switch (view.getId()) {
            case R.id.KC: teamName = "Kansas City Royals";
            case R.id.NY: teamName = "New York Yankees";
            case R.id.H: teamName = "Houston Astros";
            case R.id.LS: teamName = "St.Louis Cardinals";
            case R.id.NY2: teamName = "New York Mets";
            case R.id.SF: teamName = "San Francisco Giants";
            case R.id.Sox: teamName = "Chicago White Sox";
            case R.id.Bird: teamName = "Toronto BlueJays";
            case R.id.S: teamName = "Seattle Mariners";
            case R.id.C: teamName = "Chicago Cubs";
            case R.id.M: teamName = "Miami Marlins";
            case R.id.A: teamName = "Arizona Diamondbacks";
            case R.id.TC: teamName = "Minnesota Twins";
            case R.id.B: teamName = "Boston Red Sox";
            case R.id.T: teamName = "Texas Rangers";
            case R.id.P: teamName = "Pittsburgh Pirates";
            case R.id.A2: teamName = "Atlanta Braves";
            case R.id.LA: teamName = "Los Angeles Dodgers";
            case R.id.C2: teamName = "Cleveland Indians";
            case R.id.TB: teamName = "Tampa Bay Rays";
            case R.id.A3: teamName = "Los Angeles Angels";
            case R.id.M2: teamName = "Milwaukee Brewers";
            case R.id.P2: teamName = "Philadelphia Phillies";
            case R.id.SD: teamName = "San Diego Padres";
            case R.id.D: teamName = "Detroit Tigers";
            case R.id.O: teamName = "Baltimore Orioles";
            case R.id.A4: teamName = "Oakland Athletics";
            case R.id.C3: teamName = "Cincinatti Reds";
            case R.id.W: teamName = "Washington Nationals";
            case R.id.CR: teamName = "Colorado Rockies";



        }
    }

}
