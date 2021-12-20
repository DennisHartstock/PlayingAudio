package com.example.playingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button button;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.stuff);

        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            if (!isPlaying) {
                mediaPlayer.start();
                button.setText("pause");
                isPlaying = true;
            } else {
                mediaPlayer.pause();
                button.setText("play");
                isPlaying = false;
            }
        });
    }
}