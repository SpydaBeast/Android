package com.dubstepmusic.app;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	
	Button btZeds, btSub;
	MediaPlayer mpZeds, mpSub;
	int playing;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btZeds = (Button)findViewById(R.id.btnZed);
        btSub = (Button)findViewById(R.id.btnSub);
        btZeds.setOnClickListener(bZeds);
        btSub.setOnClickListener(bSub);
        mpZeds = new MediaPlayer();
        mpZeds = MediaPlayer.create(this, R.raw.white_satin);
        mpSub = MediaPlayer.create(this, R.raw.last_jungle);
        playing = 0;
        
    }
    Button.OnClickListener bZeds = new Button.OnClickListener(){

		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			switch (playing) {
			case 0:
				mpZeds.start();
				playing = 1;
				btZeds.setText("Pause Zeds Dead");
				btSub.setVisibility(View.INVISIBLE);
				break;

			case 1:
				mpZeds.pause();
				playing = 0;
				btZeds.setText("Play Zeds Dead");
				btSub.setVisibility(View.VISIBLE);
				break;
			}
		}
    
    
    };
    Button.OnClickListener bSub = new Button.OnClickListener(){
    	

		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (playing) {
			case 0:
				mpSub.start();
				playing = 1;
				btSub.setText("Pause Sub Focus");
				btZeds.setVisibility(View.INVISIBLE);
				break;

			case 1:
				mpSub.pause();
				playing = 0;
				btSub.setText("Play Sub Focus");
				btZeds.setVisibility(View.VISIBLE);
				break;
			}
		}
    	
    };
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
