package com.HotTunz01;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Brien on 5/13/2016.
 */
public class Album extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album);

        String[] songs = {"Come To Club", "Day Dream", "Maybe", "Ode To Gloom", "Recon"};
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs));

    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position) {
            case 0:
                startActivity(new Intent(Album.this, ComeToClub.class));
                break;
            case 1:
                startActivity(new Intent(Album.this, DayDream.class));
                break;
            case 2:
                startActivity(new Intent(Album.this, Maybe.class));
                break;
            case 3:
                startActivity(new Intent(Album.this, OdeToGloom.class));
                break;
            case 4:
                startActivity(new Intent(Album.this, Recon.class));
                break;
        }
    }
}