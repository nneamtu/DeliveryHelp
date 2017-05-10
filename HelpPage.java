package com.example.natalie.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_page);
    }

    public void helpMeNow(View view){
        Intent intent = new Intent(this, EmergencyPhonePage.class);
        startActivity(intent);
    }
    public void amIAbused(View view){
        Intent intent = new Intent(this, WebpageDisplayPage.class);
        intent.putExtra("URL", "http://www.dvrcv.org.au/help-advice/abuse-quiz");
        startActivity(intent);
    }
    public void callTransport(View view){
        Intent intent = new Intent(this, WebpageDisplayPage.class);
        intent.putExtra("URL", "https://www.taxifarefinder.com/?lang=en");
        startActivity(intent);
    }
    public void financial(View view){
        Intent intent = new Intent(this, WebpageDisplayPage.class);
        intent.putExtra("URL", "https://www.humanservices.gov.au/customer/subjects/crisis-and-special-help");
        startActivity(intent);
    }
    public void services(View view){
        Uri location = Uri.parse("geo:0,0?q=Domestic abuse shelter near me");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }
    public void myRights(View view){
        Intent intent = new Intent(this, WebpageDisplayPage.class);
        intent.putExtra("URL", "http://www.womenslaw.org");
        startActivity(intent);
    }
    public void medical(View view){
        Intent intent = new Intent(this, WebpageDisplayPage.class);
        intent.putExtra("URL", "http://www.ushospitalfinder.com");
        startActivity(intent);
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
