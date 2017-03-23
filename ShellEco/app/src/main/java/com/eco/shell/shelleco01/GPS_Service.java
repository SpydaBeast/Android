package com.eco.shell.shelleco01;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;

/**
 * Created by Brien on 2/27/2017.
 */

public class GPS_Service extends Service {

    private LocationListener listener;
    private LocationManager locationManager;
    private Location location;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

                Intent i = new Intent("Location_Update");

                i.putExtra("coordinates",location.getLatitude()+ " " +location.getLongitude()
                );
                Intent j = new Intent("Speed_Update");
                i.putExtra("speed",location.getSpeed()
                );
                sendBroadcast(i);
            }
            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {
                //noinspection MissingPermission
            }
            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {
                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(i);

            }
        };
        locationManager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
        //noinspection MissingPermission
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,1000,0,listener);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(locationManager != null){
            //noinspection MissingPermission
            locationManager.removeUpdates(listener);

        }
    }
}
