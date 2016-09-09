package com.exert.crm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainAcctProfile extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acct_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_acct_profile, menu);
        return true;
    }
}
