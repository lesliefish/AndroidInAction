package com.example.yu.androidwidgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.yu.helloworld.R;

public class DatePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        Button getTimeBtn = findViewById(R.id.getDateBtn);
        final DatePicker datePicker = findViewById(R.id.datePicker);

        getTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder builder=new StringBuilder();;
                builder.append((datePicker.getMonth() + 1)+"/");//month is 0 based
                builder.append(datePicker.getDayOfMonth()+"/");
                builder.append(datePicker.getYear());
                Toast.makeText(getApplicationContext(), builder.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
