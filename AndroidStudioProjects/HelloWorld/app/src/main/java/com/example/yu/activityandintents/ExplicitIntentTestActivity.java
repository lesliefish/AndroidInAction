package com.example.yu.activityandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.yu.helloworld.R;

public class ExplicitIntentTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent_test);

        Bundle bundle = getIntent().getExtras();
        String value1 = bundle.getString("key");
        String value2 = bundle.getString("name");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();

        Button button = findViewById(R.id.toFirstIntentBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ExplicitIntentActivity.class);
                startActivity(intent);
            }
        });
    }
}
