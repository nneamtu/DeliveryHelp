package com.example.natalie.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmergencyPhonePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_phone_page);
    }

    public void call911(View view){
        Uri number = Uri.parse("tel:5854652228");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void callHotline(View view){
        Uri number = Uri.parse("tel:5854652228");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void sendHomePage(View view){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void sendPizza(View view){
        Uri location = Uri.parse("geo:0,0?q=Pizza delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
}
