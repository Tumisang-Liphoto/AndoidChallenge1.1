package com.androidchallenge1;

import android.net.http.SslError;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About_ALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);
        WebView webView = (WebView) findViewById(R.id.ACLWebpage);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//handle the error
                handler.proceed();
            }
        });

        webView.loadUrl("http://andela.com/alc/");
        //webView.loadUrl("http://andela.com/alc/");


    }
}
