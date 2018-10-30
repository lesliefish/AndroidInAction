package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.androidwidgets.DatePickerActivity;

public class Widgets2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets2);

        // 日期
        Button datePickerBtn = findViewById(R.id.datePickerBtn);
        datePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Widgets2Activity.this, DatePickerActivity.class));
            }
        });
    }
}
