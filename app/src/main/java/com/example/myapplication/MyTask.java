/*package com.example.myapplication;

import static com.example.myapplication.MainActivity.callChatGPTAPI;
import static com.example.myapplication.MainActivity.extractTextFromChatGPTResponse;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.io.IOException;

private class MyTask extends AsyncTask<Void, Void, String> {

    //private String color;
    private String contentText;
    /*public MyTask(String color){
        this.color = color;
    } */
/*
    public String getContentText() {
        return contentText;
    }

    @Override
    protected String doInBackground(Void... params) {
        try {
            return extractTextFromChatGPTResponse(callChatGPTAPI());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onPostExecute(String result) {
        this.contentText = result;
    }


}
*/