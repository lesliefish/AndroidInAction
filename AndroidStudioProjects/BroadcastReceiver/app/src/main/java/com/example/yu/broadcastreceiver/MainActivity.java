package com.example.yu.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // 广播自定义意图。
    public void broadcastIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.csu.yu");
        sendBroadcast(intent);
    }
}
