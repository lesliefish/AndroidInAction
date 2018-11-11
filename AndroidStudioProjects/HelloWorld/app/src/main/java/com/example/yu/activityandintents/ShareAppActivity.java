package com.example.yu.activityandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.helloworld.R;

public class ShareAppActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_app);

        button = findViewById(R.id.shareAppBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "学习安卓呢");
                String url = "www.google.com.hk";
                shareIntent.putExtra(Intent.EXTRA_TEXT,url);
                startActivity(Intent.createChooser(shareIntent,"分享应用"));
            }
        });
    }
}
