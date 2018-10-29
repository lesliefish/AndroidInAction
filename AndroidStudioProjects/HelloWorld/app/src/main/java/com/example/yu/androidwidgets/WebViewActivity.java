package com.example.yu.androidwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.yu.helloworld.R;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        WebView webView = findViewById(R.id.webView);

        webView.loadUrl("https://www.baidu.com/");
        // mywebview.loadUrl("https://www.xx.com/");
        /*String data = "<html><body><h1>Hello, WebView</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */

    }
}
