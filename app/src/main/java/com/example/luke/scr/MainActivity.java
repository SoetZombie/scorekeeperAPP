package com.example.luke.scr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int foulsTeamA;
    int redCardsTeamA;
    int yellowCardsTeamA;
    int foulsTeamB;
    int redCardsTeamB;
    int yellowCardsTeamB;


    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void goalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayA(scoreTeamA);

    }

    public void goalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayB(scoreTeamB);

    }



    public void displayA(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_a_score);
        countViewer.setText("" + number);
    }

    public void displayB(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_b_score);
        countViewer.setText("" + number);
    }
    public void displayFoulsTeamA(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamAfoulsAmount);
        countViewer.setText("Fouls : " + number);

    }
    public void displayRedCardsTeamA(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamAredCardAmount);
        countViewer.setText("Red cards : " + number);

    }
    public void displayYellowCardsTeamA(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamAYellowCardAmount);
        countViewer.setText("Yellow cards : " + number);

    }

    public void displayFoulsTeamB(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamBfoulsAmount);
        countViewer.setText("Fouls : " + number);

    }
    public void displayRedCardsTeamB(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamBredCardAmount);
        countViewer.setText("Red cards : " + number);

    }
    public void displayYellowCardsTeamB(int number){
        TextView countViewer = (TextView) findViewById(R.id.teamBYellowCardAmount);
        countViewer.setText("Yellow cards : " + number);

    }


    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayB(scoreTeamB);
        displayA(scoreTeamA);
    }

    public void buttonClickFunction(View view) {
        Intent intent = new Intent(getApplicationContext(), Your_Next_Activity.class);
        startActivity(intent);
    }
    public void optionsTeamA(View view){
        setContentView(R.layout.foulsteama);
        displayFoulsTeamA(foulsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    public void optionsTeamB(View view){
        setContentView(R.layout.foulsteamb);
        displayFoulsTeamB(foulsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    public void back (View view){
        setContentView(R.layout.activity_main);
    }
    public void teamARed(View view) {
        foulsTeamA = foulsTeamA +1;
        redCardsTeamA = redCardsTeamA +1;
        displayFoulsTeamA(foulsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
    }
    public void teamAYellow(View view) {
        foulsTeamA = foulsTeamA +1;
        yellowCardsTeamA = yellowCardsTeamA +1;
        displayFoulsTeamA(foulsTeamA);
        displayYellowCardsTeamA(yellowCardsTeamA);
    }
    public void teamANoCard(View view) {
        foulsTeamA = foulsTeamA +1;
        redCardsTeamA = redCardsTeamA +1;
        displayFoulsTeamA(foulsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
    }
    public void resetFoulsTeamA(View view) {
        foulsTeamA = 0;
        redCardsTeamA =0;
        yellowCardsTeamA =0;
        displayFoulsTeamA(foulsTeamA);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayRedCardsTeamA(redCardsTeamA);
    }

    public void teamBRed(View view) {
        foulsTeamB = foulsTeamB +1;
        redCardsTeamB = redCardsTeamB +1;
        displayFoulsTeamB(foulsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }
    public void teamBYellow(View view) {
        foulsTeamB = foulsTeamB +1;
        yellowCardsTeamB = yellowCardsTeamB +1;
        displayFoulsTeamB(foulsTeamB);
        displayYellowCardsTeamB(yellowCardsTeamB);
    }
    public void teamBNoCard(View view) {
        foulsTeamB = foulsTeamB +1;
        redCardsTeamB = redCardsTeamB +1;
        displayFoulsTeamB(foulsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }
    public void resetFoulsTeamB(View view) {
        foulsTeamB = 0;
        redCardsTeamB =0;
        yellowCardsTeamB =0;
        displayFoulsTeamB(foulsTeamB);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayRedCardsTeamB(redCardsTeamB);
    }

}