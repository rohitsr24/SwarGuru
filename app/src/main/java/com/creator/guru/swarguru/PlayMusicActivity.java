package com.creator.guru.swarguru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;


public class PlayMusicActivity extends AppCompatActivity {

    private boolean isPlaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_music);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        final ImageView imageView = findViewById(R.id.playSong);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isPlaying) {
                    imageView.setImageResource(R.drawable.ic_pause_circle_filled_black_48dp);
                    isPlaying = true;
                } else {
                    imageView.setImageResource(R.drawable.ic_play_circle_filled_black_48dp);
                    isPlaying = false;
                }
            }
        });

    }
}
