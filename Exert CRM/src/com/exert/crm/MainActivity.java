package com.exert.crm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity { 
	Button buttonAdmin;
	Button buttonAccount;
	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        //JAVA UI Memory
        buttonAdmin = (Button)findViewById(R.id.buttonAdmin);
        buttonAccount = (Button)findViewById(R.id.buttonAccount);
        
        buttonAdmin.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 startActivity(new Intent(MainActivity.this, Admin.class));
			}
		});
       
        buttonAccount.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, AccountManager.class));
			}
		});
    }       
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
