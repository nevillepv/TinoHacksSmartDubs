package com.example.nevillevarghese.hackathoncode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by nevillevarghese on 4/22/18.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class driver {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] names = {"Kansas City Royals", "New York Yankees", "Houston Astros", "St.Louis Cardinals","New York Mets","San Francisco Giants","Chicago White Sox","Toronto BlueJays","Seattle Mariners","Chicago Cubs","Miami Marlins","Arizona Diamondbacks","Minnesota Twins","Boston Red Sox","Texas Rangers","Pittsburgh Pirates","Atlanta Braves","Los Angeles Dodgers","Cleveland Indians","Tampa Bay Rays","Los Angeles Angels","Milwaukee Brewers","Philadelphia Phillies","San Diego Padres","Detroit Tigers","Baltimore Orioles","Oakland Athletics","Cincinatti Reds","Washington Nationals","Colorado Rockies"};
        String[] namesAbbrev = {"KCR","NYY","HOU","STL","NYM","SFG","CHW","TOR","SEA","CHC","MIA","ARI","MIN","BOS","TEX","PIT","ATL","LAD","CLE","TBR","LAA","MIL","PHI","SDP","DET","BAL","OAK","CIN","WSN","COL"};
        ArrayList<Double> percentages = new ArrayList<>();
        String command = "C:\\Users\\devin.LAPTOP\\AppData\\Local\\Programs\\Python\\Python36\\python.exe C:\\Users\\devin.LAPTOP\\HackathonCode\\app\\src\\script.py";

        Process proc = Runtime.getRuntime().exec(command);


        //Read the output
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }


//        Scanner in = new Scanner(new InputStreamReader(proc.getInputStream()));
//        while(in.hasNextDouble()){
//            percentages.add(in.nextDouble());
//        }

        HashMap<String, Double> hm = new HashMap<>();
//        for(int i = 0 ; i < names.length;i++) {
//            hm.put(namesAbbrev[i], percentages.get(i));
//        }

        proc.waitFor();

    }
}