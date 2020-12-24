package com.example.android_28_notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // new 一個 method
    public void bt1(View view) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setTicker("xx特價")
                .setContentTitle("標題example")
                .setContentText("內容example");
        Notification notification = builder.build();
        notificationManager.cancel(0); // 移除id值為0的通知
        notificationManager.notify(0, notification);
    }
}