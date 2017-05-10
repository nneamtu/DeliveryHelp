package com.example.natalie.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
    }

    public void sendHomePage(View view) {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void sendPizza(View view){
        Uri location = Uri.parse("geo:0,0?q=Pizza delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

}
