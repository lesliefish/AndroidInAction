package com.example.yu.androidmenus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yu.helloworld.R;

public class OptionsMenuActivity extends AppCompatActivity {

    private TextView textView;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

        textView = findViewById(R.id.optionTextView);
        relativeLayout = findViewById(R.id.relativeLayout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()) {
            case R.id.profile:
                textView.setText(menuItem.getTitle());
                relativeLayout.setBackgroundColor(Color.CYAN);
                break;
            case R.id.settings:
                textView.setText(menuItem.getTitle());
                relativeLayout.setBackgroundColor(Color.MAGENTA);
                break;
            case R.id.back:
                finish();
                break;
        }

        return super.onOptionsItemSelected(menuItem);
    }
}
