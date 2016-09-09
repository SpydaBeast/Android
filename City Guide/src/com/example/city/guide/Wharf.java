package com.example.city.guide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Wharf extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wharf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.wharf, menu);
        return true;
    }
}
