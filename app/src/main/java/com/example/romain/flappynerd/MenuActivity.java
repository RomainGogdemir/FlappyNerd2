package com.example.romain.flappynerd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button highscoreButton = findViewById(R.id.activity_menu_highscore_button);
        highscoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToHIghscore();
            }
        });
    }

    private void switchToHIghscore() {
        Intent intent = new Intent(this, HighscoreActivity.class);
        startActivity(intent);
    }
}
