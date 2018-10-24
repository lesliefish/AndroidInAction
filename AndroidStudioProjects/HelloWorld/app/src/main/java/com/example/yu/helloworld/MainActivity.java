package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        // 按钮操纵
        Button learnBtn = findViewById(R.id.learnButton);
        learnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BtnLearnActivity.class);
                startActivity(intent);
            }
        });

        // EditText

        Button editTextBtn = findViewById(R.id.edit_button);
        editTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TextEditActivity.class);
                startActivity(intent);
            }
        });


        // toggleButton
        Button toggleBtn = findViewById(R.id.toggle_button);
        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToggleButtonActivity.class);
                startActivity(intent);
            }
        });

        // checkbox
        Button checkBoxBtn = findViewById(R.id.checkbox_button);
        checkBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        // radioButton
        Button radioBtn = findViewById(R.id.radio_button);
        radioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
