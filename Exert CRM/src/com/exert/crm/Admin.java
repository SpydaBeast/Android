package com.exert.crm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class Admin extends Activity {
	Button buttonBusinessdetail;
	Button buttonCustomer;
	Button buttonWorkout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        
        //Java UI Memory
        buttonBusinessdetail = (Button)findViewById(R.id.buttonBusinessdetail);
        buttonWorkout = (Button)findViewById(R.id.buttonWorkout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_admin, menu);
        return true;
    }
}
