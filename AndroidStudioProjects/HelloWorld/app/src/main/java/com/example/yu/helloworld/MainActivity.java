package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.androidwidgets.AlertDialogActivity;
import com.example.yu.androidwidgets.BtnLearnActivity;
import com.example.yu.androidwidgets.CheckBoxActivity;
import com.example.yu.androidwidgets.CustomListViewTestActivity;
import com.example.yu.androidwidgets.ListViewActivity;
import com.example.yu.androidwidgets.RadioButtonActivity;
import com.example.yu.androidwidgets.RatingBarActivity;
import com.example.yu.androidwidgets.SeekBarActivity;
import com.example.yu.androidwidgets.SpinnerActivity;
import com.example.yu.androidwidgets.TextEditActivity;
import com.example.yu.androidwidgets.TextViewActivity;
import com.example.yu.androidwidgets.ToggleButtonActivity;
import com.example.yu.androidwidgets.WebViewActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button widgets1Btn = findViewById(R.id.widgetsButton);
        widgets1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Widgets1Activity.class));
            }
        });

    }
}