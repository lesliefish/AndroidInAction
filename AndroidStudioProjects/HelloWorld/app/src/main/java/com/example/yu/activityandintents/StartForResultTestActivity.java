package com.example.yu.activityandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.yu.helloworld.R;

public class StartForResultTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result_test);

        Button button = findViewById(R.id.submitBtn);
        final EditText editText = findViewById(R.id.inputEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("Message", msg);
                setResult(2, intent);
                finish();
            }
        });
    }
}
