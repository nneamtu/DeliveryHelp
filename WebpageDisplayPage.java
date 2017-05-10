package com.example.natalie.test2;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;



public class WebpageDisplayPage extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage_display_page);
        Bundle bundle = getIntent().getExtras();
        String URL = bundle.getString("URL");
        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new MyBrowser());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(URL);
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

    private class MyBrowser extends WebViewClient {
        @Override
        @SuppressWarnings("deprecation")
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
