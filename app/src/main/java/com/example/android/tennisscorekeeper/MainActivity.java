package com.example.android.tennisscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.tennisscorekeeper.R;

public class MainActivity extends AppCompatActivity {


    // Tracks the score for TeamPackage com.example.android.tennisScoreTracker;
    //
    //import android.support.v7.app.AppCompatActivity;
    //import android.os.Bundle;
    //import android.view.View;
    //import android.widget.TextView;
    //
    //public class MainActivity extends AppCompatActivity {
    //
    //
    //    // Tracks the score for Team A
    //    int scoreTeamA = 0;
    //
    //
    //    // Tracks the score for Team B
    //    int scoreTeamB = 0;
    //
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_main);
    //    }
    //
    //    /**
    //     * Increase the score for Team A by 0 points.
    //     */
    //
    //    public void addZeroForTeamA(View v) {
    //        scoreTeamA = scoreTeamA + 0;
    //        displayForTeamA(scoreTeamA);
    //    }
    //    /**
    //     * Increase the score for Team A by 15 points.
    //     */
    //
    //    public void addFifteenForTeamA(View v) {
    //        scoreTeamA = scoreTeamA + 15;
    //        displayForTeamA(scoreTeamA);
    //    }
    //    /**
    //     * Increase the score for Team A by 30 points.
    //     */
    //
    //    public void addThirtyForTeamA(View v) {
    //        scoreTeamA = scoreTeamA + 30;
    //        displayForTeamA(scoreTeamA);
    //    }
    //
    //    /**
    //     * Increase the score for Team A by 40 points.
    //     */
    //
    //
    //    public void addFortyForTeamA(View v) {
    //        scoreTeamA = scoreTeamA + 40;
    //        displayForTeamA(scoreTeamA);
    //    }
    //
    //
    //
    //    public void resetScore (View v) {
    //        scoreTeamA = 0;
    //        scoreTeamB = 0;
    //        displayForTeamA (scoreTeamA);
    //        displayForTeamB (scoreTeamB);
    //
    //    }
    //    /**
    //     * Displays the given score for Team A.
    //     */
    //
    //
    //    public void displayForTeamA(int score) {
    //        TextView scoreView = findViewById(R.id.team_a_score);
    //        scoreView.setText(String.valueOf(score));
    //    }
    //
    //    /**
    //     * Increase the score for Team B by 0 points.
    //     */
    //
    //    public void addZeroForTeamB(View v) {
    //        scoreTeamB = scoreTeamB + 0;
    //        displayForTeamB(scoreTeamB);
    //    }
    //    /**
    //     * Increase the score for Team B by 15 points.
    //     */
    //
    //    public void addFifteenForTeamB(View v) {
    //        scoreTeamB = scoreTeamB + 15;
    //        displayForTeamB(scoreTeamB);
    //    }
    //
    //    /**
    //     * Increase the score for Team B by 30 points.
    //     */
    //
    //    public void addThirtyForTeamB(View v) {
    //        scoreTeamB = scoreTeamB + 30;
    //        displayForTeamB(scoreTeamB);
    //
    //    }
    //    /**
    //     * Increase the score for Team B by 40 points.
    //     */
    //
    //
    //    public void addFortyForTeamB(View v) {
    //        scoreTeamB = scoreTeamB + 40;
    //        displayForTeamB(scoreTeamB);
    //    }
    //
    //
    //
    //    /**
    //     * Displays the given score for Team B.
    //     */
    //    public void displayForTeamB(int score) {
    //        TextView scoreView = findViewById(R.id.team_b_score);
    //        scoreView.setText(String.valueOf(score));
    //    }
    //
    //
    //
    //
    //} A
    int scoreTeamA = 0;


    // Tracks the score for Team B
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 0 points.
     */

    public void addZeroForTeamA(View v) {
        scoreTeamA = scoreTeamA + 0;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 15 points.
     */

    public void addFifteenForTeamA(View v) {
        scoreTeamA = scoreTeamA + 15;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 30 points.
     */

    public void addThirtyForTeamA(View v) {
        scoreTeamA = scoreTeamA + 30;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 40 points.
     */


    public void addFortyForTeamA(View v) {
        scoreTeamA = scoreTeamA + 40;
        displayForTeamA(scoreTeamA);
    }



    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB (scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */


    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 0 points.
     */

    public void addZeroForTeamB(View v) {
        scoreTeamB = scoreTeamB + 0;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 15 points.
     */

    public void addFifteenForTeamB(View v) {
        scoreTeamB = scoreTeamB + 15;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 30 points.
     */

    public void addThirtyForTeamB(View v) {
        scoreTeamB = scoreTeamB + 30;
        displayForTeamB(scoreTeamB);

    }
    /**
     * Increase the score for Team B by 40 points.
     */


    public void addFortyForTeamB(View v) {
        scoreTeamB = scoreTeamB + 40;
        displayForTeamB(scoreTeamB);
    }



    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }




}
