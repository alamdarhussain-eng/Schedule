package com.example.schedule;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // 🔴 اپنا Google Apps Script Web App URL یہاں لگائیں
        webView.loadUrl("https://script.google.com/macros/s/YOUR_SCRIPT_ID/exec");

        setContentView(webView);
    }
}
