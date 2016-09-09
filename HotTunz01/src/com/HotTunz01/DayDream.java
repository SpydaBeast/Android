package com.HotTunz01;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brien on 5/16/2016.
 */
public class DayDream extends Activity {
    Button btnPlay, btnStop;
    MediaPlayer mediaDayDream;
    int playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daydream);

        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(bPlay);
        mediaDayDream = new MediaPlayer();
        mediaDayDream = MediaPlayer.create(this, R.raw.daydreammusic);
        playing = 0;
    }

    Button.OnClickListener bPlay = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mediaDayDream.start();
                    playing = 1;
                    btnPlay.setText("Pause");
                    break;
                case 1:
                    mediaDayDream.pause();
                    playing = 0;
                    btnPlay.setText("Play");
                    break;

            }

        }
    };

}