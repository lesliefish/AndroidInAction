package com.example.yu.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        final CheckBox cb1 = findViewById(R.id.checkbox_1);
        final CheckBox cb2 = findViewById(R.id.checkbox_2);
        final CheckBox cb3 = findViewById(R.id.checkbox_3);

        Button testBtn = findViewById(R.id.test_btn);

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    Log.d("cb1","cb1 is checked");
                }
                if(cb2.isChecked()){
                    Log.d("cb2","cb2 is checked");
                }
                if(cb3.isChecked()){
                    Log.d("cb3","cb3 is checked");
                }

                StringBuilder sb = new StringBuilder();
                sb.append("cb1" + cb1.isChecked()).append("\ncb2" + cb2.isChecked()).append("\ncb3" + cb3.isChecked());
                //
                Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
