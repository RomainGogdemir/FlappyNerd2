package com.example.romain.flappynerd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighscoreActivity extends AppCompatActivity {

    public final static String HIGHSCORE = "highscore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        displayHighscore();
    }

    private String[] getHighscores() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String highscoreString = preferences.getString(HIGHSCORE, null);
        if (highscoreString == null)
            return null;
        return highscoreString.split("&");
    }

    public void displayHighscore(){
        TextView highscoreDisplay = findViewById(R.id.activity_highscore_textview);
        String[] highscoreList = getHighscores();
        if (highscoreList == null){
            highscoreDisplay.setText(R.string.noHighscore);
        }
        else {
            //highscoreDisplay.setText();&
        }
    }
}