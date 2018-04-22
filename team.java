package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class team extends AppCompatActivity {
    public static String teamName;
    public static int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    public void sendMessage(View view){
        int id = view.getId();
        switch (id) {
            case R.id.KC: teamName = "Kansas City Royals";
            position = 0;
            break;
            case R.id.NY: teamName = "New York Yankees";
                position = 1;
                break;
            case R.id.H: teamName = "Houston Astros";
                position = 2;
                break;
            case R.id.LS: teamName = "St.Louis Cardinals";
                position = 3;
                break;
            case R.id.NY2: teamName = "New York Mets";
                position = 4;
                break;
            case R.id.SF: teamName = "San Francisco Giants";
                position = 5;
                break;
            case R.id.Sox: teamName = "Chicago White Sox";
                position = 6;
                break;
            case R.id.Bird: teamName = "Toronto BlueJays";
                position = 7;
                break;
            case R.id.S: teamName = "Seattle Mariners";
                position = 8;
                break;
            case R.id.C: teamName = "Chicago Cubs";
                position = 9;
                break;
            case R.id.M: teamName = "Miami Marlins";
                position = 10;
                break;
            case R.id.A: teamName = "Arizona Diamondbacks";
                position = 11;
                break;
            case R.id.TC: teamName = "Minnesota Twins";
                position = 12;
                break;
            case R.id.B: teamName = "Boston Red Sox";
                position = 13;
                break;
            case R.id.T: teamName = "Texas Rangers";
                position = 14;
                break;
            case R.id.P: teamName = "Pittsburgh Pirates";
                position = 15;
                break;
            case R.id.A2: teamName = "Atlanta Braves";
                position = 16;
                break;
            case R.id.LA: teamName = "Los Angeles Dodgers";
                position = 17;
                break;
            case R.id.C2: teamName = "Cleveland Indians";
                position = 18;
                break;
            case R.id.TB: teamName = "Tampa Bay Rays";
                position = 19;
                break;
            case R.id.A3: teamName = "Los Angeles Angels";
                position = 20;
                break;
            case R.id.M2: teamName = "Milwaukee Brewers";
                position = 21;
                break;
            case R.id.P2: teamName = "Philadelphia Phillies";
                position = 22;
                break;
            case R.id.SD: teamName = "San Diego Padres";
                position = 23;
                break;
            case R.id.D: teamName = "Detroit Tigers";
                position = 24;
                break;
            case R.id.O: teamName = "Baltimore Orioles";
                position = 25;
                break;
            case R.id.A4: teamName = "Oakland Athletics";
                position = 26;
                break;
            case R.id.C3: teamName = "Cincinatti Reds";
                position = 27;
                break;
            case R.id.W: teamName = "Washington Nationals";
                position = 28;
                break;
            case R.id.CR: teamName = "Colorado Rockies";
                position = 29;
                break;
        }
        Intent in = new Intent(this, percent.class);
        startActivity(in);
    }

    public String getTeamName() {
        return teamName;
    }

}
