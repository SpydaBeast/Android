package com.HotTunz01;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brien on 5/16/2016.
 */
public class ComeToClub extends Activity {
    Button btnPlay, btnStop;
    MediaPlayer mediaComeToClub;
    int playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cometoclub);

        btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(bPlay);
        mediaComeToClub = new MediaPlayer();
        mediaComeToClub = MediaPlayer.create(this, R.raw.cometoclubmusic);
        playing = 0;
    }
    Button.OnClickListener bPlay = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mediaComeToClub.start();
                    playing = 1;
                    btnPlay.setText("Pause");
                    break;
                case 1:
                    mediaComeToClub.pause();
                    playing = 0;
                    btnPlay.setText("Play");
                    break;
            }
        }
    };
}