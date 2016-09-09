package com.eastern.music;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class Main extends Activity {
	Button btBamboo, btPalace;
	MediaPlayer mpBamboo, mpPalace;
	int playing;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btBamboo = (Button)findViewById(R.id.btnBamboo);
        btPalace = (Button)findViewById(R.id.btnPalace);
        btBamboo.setOnClickListener(bBamboo);    
    }
    
    Button.OnClickListener bBamboo = new Button.OnClickListener(){
    	
    	
    	@Override
    	public void OnCli
    }
    	
        
  
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   
}
