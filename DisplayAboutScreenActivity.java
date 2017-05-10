package com.example.natalie.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;


public class DisplayAboutScreenActivity extends AppCompatActivity {

    ToggleButton btn;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about_screen);
        btn = (ToggleButton)findViewById(R.id.toggleButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNotification();
            }
        });

    }

    public void getNotification(){
        if(btn.isChecked()){
            android.support.v4.app.NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.ic_adb_black_24dp)
                            .setContentTitle("ORDER NOW")
                            .setContentText("CLICK TO RECORD YOUR ORDER");

            Intent notificationIntent = new Intent(this, ClickActivity.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT);
            Intent clickIntent = new Intent(this, ClickActivity.class);
            builder.setContentIntent(contentIntent);

            // Add as notification
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());



        }
    }

    public void sendHomePage(View view) {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void sendHelpPage(View view){
        if (count < 5)
            count++;
        else {
            Intent intent = new Intent(this, HelpPage.class);
            startActivity(intent);
            count = 0;
        }
    }
}
