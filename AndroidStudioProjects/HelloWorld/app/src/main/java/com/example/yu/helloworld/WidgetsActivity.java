package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.yu.androidwidgets.AlertDialogActivity;
import com.example.yu.androidwidgets.BtnLearnActivity;
import com.example.yu.androidwidgets.CheckBoxActivity;
import com.example.yu.androidwidgets.CustomListViewTestActivity;
import com.example.yu.androidwidgets.DatePickerActivity;
import com.example.yu.androidwidgets.ListViewActivity;
import com.example.yu.androidwidgets.RadioButtonActivity;
import com.example.yu.androidwidgets.RatingBarActivity;
import com.example.yu.androidwidgets.SeekBarActivity;
import com.example.yu.androidwidgets.SpinnerActivity;
import com.example.yu.androidwidgets.TextEditActivity;
import com.example.yu.androidwidgets.TextViewActivity;
import com.example.yu.androidwidgets.ToggleButtonActivity;
import com.example.yu.androidwidgets.ViewPagerActivity;
import com.example.yu.androidwidgets.WebViewActivity;

public class WidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_widgets1);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        // 按钮操纵
        Button learnBtn = findViewById(R.id.learnButton);
        learnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, BtnLearnActivity.class);
                startActivity(intent);
            }
        });

        // EditText

        Button editTextBtn = findViewById(R.id.edit_button);
        editTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, TextEditActivity.class);
                startActivity(intent);
            }
        });

        // toggleButton
        Button toggleBtn = findViewById(R.id.toggle_button);
        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, ToggleButtonActivity.class);
                startActivity(intent);
            }
        });

        // checkbox
        Button checkBoxBtn = findViewById(R.id.checkbox_button);
        checkBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        // radioButton
        Button radioBtn = findViewById(R.id.radio_button);
        radioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        // alertDialog
        Button alertDialogBtn = findViewById(R.id.alert_dialog_button);
        alertDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });

        // spinnerBtn
        Button spinnerBtn = findViewById(R.id.spinner_button);
        spinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        // listviewBtn
        Button listviewBtn = findViewById(R.id.listview_button);
        listviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        // customListviewBtn
        Button customListviewBtn = findViewById(R.id.custom_list_view_button);
        customListviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, CustomListViewTestActivity.class);
                startActivity(intent);
            }
        });

        // ratingBarBtn
        Button ratingBarBtn = findViewById(R.id.ratingBarBtn);
        ratingBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, RatingBarActivity.class);
                startActivity(intent);
            }
        });

        // webViewBtn
        Button webViewBtn = findViewById(R.id.webViewBtn);
        webViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        // seekBarBtn
        Button seekBarBtn = findViewById(R.id.seekBarBtn);
        seekBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WidgetsActivity.this, SeekBarActivity.class);
                startActivity(intent);
            }
        });

        // 日期
        Button datePickerBtn = findViewById(R.id.datePickerBtn);
        datePickerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WidgetsActivity.this, DatePickerActivity.class));
            }
        });

        // viewPager
        Button viewPagerBtn = findViewById(R.id.viewPagerBtn);
        viewPagerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WidgetsActivity.this, ViewPagerActivity.class));
            }
        });
    }
}
