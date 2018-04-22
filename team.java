package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class team extends AppCompatActivity {
    public static String teamName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    public void sendMessage(View view){
        int id = view.getId();
        switch (id) {
            case R.id.KC: teamName = "Kansas City Royals";
            break;
            case R.id.NY: teamName = "New York Yankees";
                break;
            case R.id.H: teamName = "Houston Astros";
                break;
            case R.id.LS: teamName = "St.Louis Cardinals";
                break;
            case R.id.NY2: teamName = "New York Mets";
                break;
            case R.id.SF: teamName = "San Francisco Giants";
                break;
            case R.id.Sox: teamName = "Chicago White Sox";
                break;
            case R.id.Bird: teamName = "Toronto BlueJays";
                break;
            case R.id.S: teamName = "Seattle Mariners";
                break;
            case R.id.C: teamName = "Chicago Cubs";
                break;
            case R.id.M: teamName = "Miami Marlins";
                break;
            case R.id.A: teamName = "Arizona Diamondbacks";
                break;
            case R.id.TC: teamName = "Minnesota Twins";
                break;
            case R.id.B: teamName = "Boston Red Sox";
                break;
            case R.id.T: teamName = "Texas Rangers";
                break;
            case R.id.P: teamName = "Pittsburgh Pirates";
                break;
            case R.id.A2: teamName = "Atlanta Braves";
                break;
            case R.id.LA: teamName = "Los Angeles Dodgers";
                break;
            case R.id.C2: teamName = "Cleveland Indians";
                break;
            case R.id.TB: teamName = "Tampa Bay Rays";
                break;
            case R.id.A3: teamName = "Los Angeles Angels";
                break;
            case R.id.M2: teamName = "Milwaukee Brewers";
                break;
            case R.id.P2: teamName = "Philadelphia Phillies";
                break;
            case R.id.SD: teamName = "San Diego Padres";
                break;
            case R.id.D: teamName = "Detroit Tigers";
                break;
            case R.id.O: teamName = "Baltimore Orioles";
                break;
            case R.id.A4: teamName = "Oakland Athletics";
                break;
            case R.id.C3: teamName = "Cincinatti Reds";
                break;
            case R.id.W: teamName = "Washington Nationals";
                break;
            case R.id.CR: teamName = "Colorado Rockies";
                break;
        }
        Intent in = new Intent(this, percent.class);
        startActivity(in);
    }

    public String getTeamName() {
        return teamName;
    }

}
