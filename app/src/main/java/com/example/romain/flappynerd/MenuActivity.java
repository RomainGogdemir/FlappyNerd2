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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mPlayButton = findViewById(R.id.activity_menu_play_button);
        mHighscoreButton = findViewById(R.id.activity_menu_highscore_button);
        mOptionsButton = findViewById(R.id.activity_menu_options_button);
        mContainer = findViewById(R.id.activity_menu_background_visual_textview);

        mPlayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent playActivity = new Intent(MenuActivity.this, PlayActivity.class);
                startActivity(playActivity);
            }

        });

        mHighscoreButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent highscoreActivity = new Intent(MenuActivity.this, HighscoreActivity.class);
                startActivity(highscoreActivity);
            }

        });

        mOptionsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent OptionsActivity = new Intent(MenuActivity.this, OptionsActivity.class);
                startActivity(OptionsActivity);
            }

        });

        setContentView(R.layout.activity_menu);
    }
}
