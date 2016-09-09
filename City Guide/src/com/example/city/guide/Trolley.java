package com.example.city.guide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Trolley extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trolley);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.trolley, menu);
        return true;
    }
}
