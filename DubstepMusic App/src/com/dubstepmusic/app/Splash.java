package com.dubstepmusic.app;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				startActivity(new Intent(Splash.this, Main.class));
			}
		};
		Timer opening = new Timer();
		opening.schedule(task, 5000);
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
}
