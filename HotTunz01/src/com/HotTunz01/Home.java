package com.HotTunz01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Brien on 5/18/2016.
 */
public class Home extends Activity {

    Button btnAlbum;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        btnAlbum = (Button)findViewById(R.id.btnAlbum);

        btnAlbum.setOnClickListener(bAlbum);
    }
    Button.OnClickListener bAlbum = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(Home.this, Album.class));
        }
    };
}