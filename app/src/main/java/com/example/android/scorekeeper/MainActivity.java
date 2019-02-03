package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayYellowForTeamA(0);
        displayYellowForTeamB(0);
        displayRedForTeamA(0);
        displayRedForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);


    }

    public void addGoalForTeamA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    public void addYellowForTeamA (View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);

    }

    public void addRedForTeamA (View v) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);

    }

    public void addFoulForTeamA (View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);

    }

    public void addGoalForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    public void addYellowForTeamB (View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);

    }

    public void addRedForTeamB (View v) {
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);

    }

    public void addFoulForTeamB (View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);

    }

    public void reset (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;

        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int yellowTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a);
        scoreView.setText(String.valueOf(yellowTeamA));
    }


    public void displayYellowForTeamB(int yellowTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b);
        scoreView.setText(String.valueOf(yellowTeamB));
    }

    public void displayRedForTeamA(int redTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.red_a);
        scoreView.setText(String.valueOf(redTeamA));
    }


    public void displayRedForTeamB(int redTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.red_b);
        scoreView.setText(String.valueOf(redTeamB));
    }

    public void displayFoulForTeamA(int foulTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.foul_a);
        scoreView.setText(String.valueOf(foulTeamA));
    }


    public void displayFoulForTeamB(int foulTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.foul_b);
        scoreView.setText(String.valueOf(foulTeamB));
    }

}