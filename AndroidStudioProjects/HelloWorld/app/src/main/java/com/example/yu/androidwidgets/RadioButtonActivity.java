package com.example.yu.androidwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.yu.helloworld.R;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        final RadioGroup radioGroup = findViewById(R.id.radio_group);

        final Button testBtn = findViewById(R.id.test_btn);
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectId = radioGroup.getCheckedRadioButtonId();
                if (selectId == -1) {
                    Toast.makeText(getApplicationContext(), "None Selected.", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    RadioButton rb = findViewById(selectId);
                    Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
