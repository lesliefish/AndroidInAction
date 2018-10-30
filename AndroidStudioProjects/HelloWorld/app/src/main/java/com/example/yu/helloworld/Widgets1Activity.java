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

public class Widgets1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets1);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });

        // 按钮操纵
        Button learnBtn = findViewById(R.id.learnButton);
        learnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, BtnLearnActivity.class);
                startActivity(intent);
            }
        });

        // EditText

        Button editTextBtn = findViewById(R.id.edit_button);
        editTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, TextEditActivity.class);
                startActivity(intent);
            }
        });

        // toggleButton
        Button toggleBtn = findViewById(R.id.toggle_button);
        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, ToggleButtonActivity.class);
                startActivity(intent);
            }
        });

        // checkbox
        Button checkBoxBtn = findViewById(R.id.checkbox_button);
        checkBoxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        // radioButton
        Button radioBtn = findViewById(R.id.radio_button);
        radioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        // alertDialog
        Button alertDialogBtn = findViewById(R.id.alert_dialog_button);
        alertDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, AlertDialogActivity.class);
                startActivity(intent);
            }
        });

        // spinnerBtn
        Button spinnerBtn = findViewById(R.id.spinner_button);
        spinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        // listviewBtn
        Button listviewBtn = findViewById(R.id.listview_button);
        listviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });

        // customListviewBtn
        Button customListviewBtn = findViewById(R.id.custom_list_view_button);
        customListviewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, CustomListViewTestActivity.class);
                startActivity(intent);
            }
        });

        // ratingBarBtn
        Button ratingBarBtn = findViewById(R.id.ratingBarBtn);
        ratingBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, RatingBarActivity.class);
                startActivity(intent);
            }
        });

        // webViewBtn
        Button webViewBtn = findViewById(R.id.webViewBtn);
        webViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        // seekBarBtn
        Button seekBarBtn = findViewById(R.id.seekBarBtn);
        seekBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Widgets1Activity.this, SeekBarActivity.class);
                startActivity(intent);
            }
        });
    }
}
