package com.edustan.wallpaper;

import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

public class PhoneUnlockedReceiver extends BroadcastReceiver {
    final String TAG = "wally";
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // do whatever you need to do here
            Log.d(TAG, "Phone unlocked");
            // TODO Auto-generated method stub
            WallpaperManager myWallpaperManager
                    = WallpaperManager.getInstance(context.getApplicationContext());
            try {

                myWallpaperManager.setResource(R.raw.image_one);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // and do whatever you need to do here
            Log.d(TAG, "Phone locked");

        }

    }
}