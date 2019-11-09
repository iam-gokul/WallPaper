package com.edustan.wallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = pm.isScreenOn();

        if(!isScreenOn){
            Log.d("Wally", "Phone unlocked");
            WallpaperManager myWallpaperManager
                = WallpaperManager.getInstance(getApplicationContext());
        try {

            myWallpaperManager.setResource(R.raw.image_one);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            try {

                myWallpaperManager.setResource(R.raw.image_one);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
