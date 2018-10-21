package com.example.yu.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        // 中划线 抗锯齿
        TextView textView = findViewById(R.id.middle_line_text);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        textView.getPaint().setAntiAlias(true);  // 去除锯齿

        // 下划线
        TextView textView2 = findViewById(R.id.under_line_text);
        textView2.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        // 滚动的文本
        TextView rollText  = findViewById(R.id.roll_text);
        rollText.setText(Html.fromHtml("<u> take me fly , take me fly , take me fly , take me fly , take me fly </u>"));
        rollText.setSelected(true);
    }
}
