package com.example.yu.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CustomListViewTestActivity extends AppCompatActivity {

    private ListView listView;
    String[] titles = {
            "Android", "Circle",
            "LinkedIn", "Twitter",
            "YouTuBe",
    };

    String[] subTitles = {
            "i like you", "draw it",
            "make friends", "share yourself",
            "watch videos",
    };

    Integer[] imagesId = {
            R.drawable.logo_android, R.drawable.logo_circle,
            R.drawable.logo_linkedin, R.drawable.logo_twitter,
            R.drawable.logo_youtube
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_test);

        listView = findViewById(R.id.custom_list_view);
        final CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter
                (this, titles, subTitles, imagesId);
        listView.setAdapter(customListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String showStr = "";
                showStr = customListViewAdapter.getSubTitles()[i];

                Toast.makeText(getApplicationContext(), showStr, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
