package com.example.yu.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yu.androidmenus.ContextMenuActivity;
import com.example.yu.androidmenus.OptionsMenuActivity;
import com.example.yu.androidmenus.PopupMenuActivity;

public class MenusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        Button optionMenuBtn = findViewById(R.id.optionMenuButton);
        optionMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OptionsMenuActivity.class);
                startActivity(intent);
            }
        });

        Button contextMenuBtn = findViewById(R.id.contextMenuButton);
        contextMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ContextMenuActivity.class);
                startActivity(intent);
            }
        });

        Button popupMenuBtn = findViewById(R.id.popupMenuBtn);
        popupMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PopupMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
