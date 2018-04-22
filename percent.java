package com.example.nevillevarghese.hackathoncode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class percent extends AppCompatActivity {

    private String mTextMessage;
    private double percentage;
    private int pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent);
        mTextMessage = team.teamName;
        pos = team.position;

        Scanner scanner = new Scanner("");
            scanner = new Scanner("0.162475   0.01328746 0.01328746 0.26926326 0.15118366 0.01328746\n" +
                    " 0.00115643 0.162475   0.20115643 0.22453457 0.00115643 0.30115643\n" +
                    " 0.00115643 0.00115643 0.12045028 0.24897902 0.00115643 0.162475\n" +
                    " 0.00115643 0.00115643 0.01328746 0.00115643 0.00115643 0.03011563\n" +
                    " 0.28987743 0.00115643 0.00115643 0.02115643 0.00115643 0.00115643");
        double[] dubs = new double[30];
        for (int i = 0; i < dubs.length; i++) {
            dubs[i] = scanner.nextDouble();
        }
        TextView perc = (TextView)findViewById(R.id.Ratio);
        double fin = dubs[pos] * 100;
        perc.setText(String.format("%.2f%s", fin, "%"));
        TextView myAwesomeTextView = (TextView)findViewById(R.id.Team);
        myAwesomeTextView.setText(mTextMessage);
//        mTextMessage = team.teamName;
//        pos = team.position;
//
//        try {
//            Scanner in = new Scanner(new File("C:\\Users\\devin.LAPTOP\\Desktop\\output.txt"));
//            double[] dubs = new double[30];
//            for(int i = 0;i<dubs.length;i++) {
//                String d = in.next();
//                dubs[i]=Double.parseDouble(d);
//                System.out.println(dubs[i]);
//            }
//            TextView perc = (TextView)findViewById(R.id.Ratio);
//            double fin = dubs[pos] * 100;
//            perc.setText(String.format("%.2f", fin));
//            TextView myAwesomeTextView = (TextView)findViewById(R.id.Team);
//            myAwesomeTextView.setText(mTextMessage);
//        } catch(FileNotFoundException er) {
//            System.out.println("BRUHHHH");
//        }
    }

    public void sendMessage(View view) {
        Intent in = new Intent(this, team.class);
        startActivity(in);
    }

}
