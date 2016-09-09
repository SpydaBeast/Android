package com.HotTunz01;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Maybe extends Activity {
    Button btnPlay, btnStop;
    MediaPlayer mediaMaybe;
    int playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maybe);

        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(bPlay);
        mediaMaybe = new MediaPlayer();
        mediaMaybe = MediaPlayer.create(this, R.raw.maybemusic);
        playing = 0;
    }

    Button.OnClickListener bPlay = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mediaMaybe.start();
                    playing = 1;
                    btnPlay.setText("Pause");
                    break;
                case 1:
                    mediaMaybe.pause();
                    playing = 0;
                    btnPlay.setText("Play");
                    break;
            }
        }
    };

}