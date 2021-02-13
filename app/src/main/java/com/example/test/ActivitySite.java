package com.example.test;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivitySite extends AppCompatActivity {
    WebView tarayıcı;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        tarayıcı = (WebView)findViewById(R.id.tarayıcı);

        tarayıcı.getSettings().setJavaScriptEnabled(true);
        tarayıcı.setWebViewClient(new WebViewClient());
        tarayıcı.setWebChromeClient(new WebChromeClient());
        tarayıcı.loadUrl("https://gezimanya.com/");


    }
}
