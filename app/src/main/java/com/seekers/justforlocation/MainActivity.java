package com.seekers.justforlocation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double actualLat = 00, actualLon = 00;
    GPSTracker gpsTracker;
    TextView latlong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gpsTracker = new GPSTracker(this);
        latlong = findViewById(R.id.latandlong);


            if (gpsTracker.getIsGPSTrackingEnabled()) {
                String stringLatitude = String.valueOf(gpsTracker.latitude);
                String stringLongitude = String.valueOf(gpsTracker.longitude);
                latlong.setText("lat:" + stringLatitude + " long:" + stringLongitude);
            } else {
                gpsTracker.showSettingsAlert();
            }
        }
    }


