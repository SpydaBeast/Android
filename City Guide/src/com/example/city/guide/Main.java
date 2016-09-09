package com.example.city.guide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends ListActivity {

	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        String [] attraction = {"Alcartraz Island", "Ferry Marketplace" , "Goldend Gate Bridge" ,
    		"Cable Car Trolley" , "Fisherman's Warf"};
        setListAdapter(new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, attraction));
    	}
    protected void onListItemClick(ListView l, View v, int position, long id){
	switch(position){
    case 0:
    	startActivity(new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://alcatrazcruises.com/")));
    	break;
    case 1:
    	startActivity(new Intent(Intent.ACTION_VIEW,
    			Uri.parse("http://ferrybuildingmarketplace.com/")));
    	break;
    case 2: 
    	startActivity(new Intent(Main.this, Bridge.class));
    	
    	break;
    case 3:
    	startActivity(new Intent(Main.this, Trolley.class));
    	
    	break;
    case 4:
    	startActivity(new Intent(Main.this, Wharf.class));
    	
    	break;
    }
    
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
