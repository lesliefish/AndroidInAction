package com.example.yu.androidwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.yu.helloworld.R;

public class ToggleButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);


        final ToggleButton tbtn1 = findViewById(R.id.tb_1);
        final ToggleButton tbtn2 = findViewById(R.id.tb_2);

        Button btn = findViewById(R.id.test_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("tb1:").append(tbtn1.getText());
                result.append("\ntb2:").append(tbtn2.getText());

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
