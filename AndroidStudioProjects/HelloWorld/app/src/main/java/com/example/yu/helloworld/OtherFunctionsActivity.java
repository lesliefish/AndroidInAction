package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.helloworld.R;
import com.example.yu.otherfuntions.TextToSpeechActivity;

public class OtherFunctionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_funtions);

        Button textToSpeechTestBtn = findViewById(R.id.textToSpeechTestBtn);
        textToSpeechTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TextToSpeechActivity.class);
                startActivity(intent);
            }
        });
    }
}
