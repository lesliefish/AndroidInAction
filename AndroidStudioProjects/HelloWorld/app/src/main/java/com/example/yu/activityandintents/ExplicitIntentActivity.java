package com.example.yu.activityandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.helloworld.R;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        Button btn = findViewById(R.id.toSecondIntentBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ExplicitIntentTestActivity.class);
                intent.putExtra("key", "i have a key");
                intent.putExtra("name", "i have a name");
                startActivity(intent);
            }
        });
    }
}
