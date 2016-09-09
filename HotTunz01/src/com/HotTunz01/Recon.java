package com.HotTunz01;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brien on 5/16/2016.
 */
public class Recon extends Activity {

    Button btnPlay, btnStop;
    MediaPlayer mediaRecon;
    int playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recon);

        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(bPlay);
        mediaRecon = new MediaPlayer();
        mediaRecon = MediaPlayer.create(this, R.raw.reconmusic);
        playing = 0;
    }

    Button.OnClickListener bPlay = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mediaRecon.start();
                    playing = 1;
                    btnPlay.setText("Pause");
                    break;
                case 1:
                    mediaRecon.pause();
                    playing = 0;
                    btnPlay.setText("Play");
                    break;
            }
        }
    };
}