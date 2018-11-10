package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.activityAndIntents.ActivityLifeCircleActivity;

public class ActivityAndIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and_intent);

        Button activityLifeCircleBtn = findViewById(R.id.lifeCircleBtn);
        activityLifeCircleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityLifeCircleActivity.class);
                startActivity(intent);
            }
        });
    }
}
