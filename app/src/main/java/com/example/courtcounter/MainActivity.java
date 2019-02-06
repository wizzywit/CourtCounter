package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToTeamA(View v) {
        teamAScore += 3;
        displayA(teamAScore);
    }

    private void displayA(int score) {
        TextView text = (TextView) findViewById(R.id.team_A_Score);
        text.setText("" + score);
    }

    public void addTwoToTeamA(View v) {
        teamAScore += 2;
        displayA(teamAScore);
    }

    public void addOneToTeamA(View v) {
        teamAScore += 1;
        displayA(teamAScore);
    }

    public void addThreeToTeamB(View v) {
        teamBScore += 3;
        displayB(teamBScore);
    }

    private void displayB(int score) {
        TextView text = (TextView) findViewById(R.id.team_B_Score);
        text.setText("" + score);
    }

    public void addTwoToTeamB(View v) {
        teamBScore += 2;
        displayB(teamBScore);
    }

    public void addOneToTeamB(View v) {
        teamBScore += 1;
        displayB(teamBScore);
    }

    public void reset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayA(teamAScore);
        displayB(teamBScore);
    }


}
