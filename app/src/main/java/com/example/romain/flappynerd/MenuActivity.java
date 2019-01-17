package com.example.romain.flappynerd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private Button mPlayButton;
    private Button mHighscoreButton;
    private Button mOptionsButton;
    private TextView mContainer;


    public void onPlayButtonClick(View v)
    {
        Intent playActivity = new Intent(getBaseContext(), PlayActivity.class);
        startActivity(playActivity);
    }

    public void onHighscoreButtonClick(View v)
    {
        Intent highscoreActivity = new Intent(getBaseContext(), HighscoreActivity.class);
        startActivity(highscoreActivity);
    }

    public void onOptionsButtonClick(View v)
    {
        Intent optionsActivity = new Intent(getBaseContext(), OptionsActivity.class);
        startActivity(optionsActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
}
