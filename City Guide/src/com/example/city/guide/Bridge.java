package com.example.city.guide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Bridge extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bridge);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bridge, menu);
        return true;
    }
}
