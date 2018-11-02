package com.example.yu.androidwidgets;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yu.helloworld.R;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager viewPager = findViewById(R.id.viewPager);

        ViewPagerImageAdapter viewPagerImageAdapter = new ViewPagerImageAdapter(this);
        viewPager.setAdapter(viewPagerImageAdapter);
    }
}
