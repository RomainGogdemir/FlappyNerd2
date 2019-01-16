package com.example.romain.flappynerd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    private Button mEndOfPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mEndOfPlay = findViewById(R.id.activity_play_end_of_game_button);

        mEndOfPlay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent menuActivity = new Intent(PlayActivity.this, MenuActivity.class);
                startActivity(menuActivity);
            }

        });

        setContentView(R.layout.activity_play);
    }

}
