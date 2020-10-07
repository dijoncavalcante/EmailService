package com.dijon.serviceemailupdate;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class EmailService extends Service {
    static final String TAG = "EmailService";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate() ");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent intentBroadcast = new Intent("ACTION_UPDATE_EMAIL_LIST");
        intentBroadcast.putExtra("ACTION", " -Answer Broadcast Rreceive -");
        Bundle bundle = new Bundle();
        intentBroadcast.putExtra("bundle", bundle);
        sendBroadcast(intentBroadcast);
        Log.d(TAG, "onStartCommand() intentBroadcast ACTION_UPDATE_EMAIL_LIST");
        //stopSelf();
        return START_NOT_STICKY;
        //super. onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy() ");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind() ");
        return null;
    }
}
