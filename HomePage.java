package com.example.natalie.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void sendDisplayAboutScreen(View view){
        Intent intent = new Intent(this, DisplayAboutScreenActivity.class);
        startActivity(intent);
        //Intent intent = new Intent(this, WebpageDisplayPage.class);
        //startActivity(intent);
    }

    public void sendPizza(View view){
        Uri location = Uri.parse("geo:0,0?q=Pizza delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendChinese(View view){
        Uri location = Uri.parse("geo:0,0?q=Chinese delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendMexican(View view){
        Uri location = Uri.parse("geo:0,0?q=Mexican delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendBurger(View view){
        Uri location = Uri.parse("geo:0,0?q=Burger delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendSushi(View view){
        Uri location = Uri.parse("geo:0,0?q=Sushi delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendItalian(View view){
        Uri location = Uri.parse("geo:0,0?q=Italian delivery near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void sendSearch(View view){
        Intent intent;
        EditText editText = (EditText) findViewById(R.id.edit_search);
        String message = editText.getText().toString();
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + message + " delivery near me"));
        startActivity(intent);
    }
}
