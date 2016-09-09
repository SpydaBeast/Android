package com.exert.crm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class AccountManager extends Activity {
	ListView listViewAccounts;
	Button buttonNewAccount;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_manager);
        
       buttonNewAccount = (Button)buttonNewAccount.findViewById(R.id.buttonNewAccount);
        
       buttonNewAccount.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			startActivity(new Intent(AccountManager.this, MainAcctProfile.class));
		}
	});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_account_manager, menu);
        return true;
    }
}
