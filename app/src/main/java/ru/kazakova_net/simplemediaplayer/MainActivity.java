package ru.kazakova_net.simplemediaplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.lp_suspicion);

        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(this);

        Button pauseButton = findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(this);

        Button addSecButton = findViewById(R.id.add_sec_button);
        addSecButton.setOnClickListener(this);

        Button showExampleButton = findViewById(R.id.show_example_button);
        showExampleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.play_button:
                mediaPlayer.start();

                break;
            case R.id.pause_button:
                mediaPlayer.pause();

                break;
            case R.id.add_sec_button:
                mediaPlayer.seekTo(mediaPlayer.getCurrentPosition() + 10000);

                break;
            case R.id.show_example_button:
                startActivity(new Intent(MainActivity.this, ExampleActivity.class));

                break;
        }
    }
}
