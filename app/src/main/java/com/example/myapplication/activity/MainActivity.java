package com.example.myapplication.activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;


public class MainActivity extends CustomBaseActivity {

    Button btnFa, btnEn, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnFa = findViewById(R.id.btnFa);
        btnEn = findViewById(R.id.btnEn);
        btnNext = findViewById(R.id.btnNext);


        btnEn.setOnClickListener(view -> {
            LocaleManager.setNewLocale(MainActivity.this, "en");
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
        });

        btnFa.setOnClickListener(view -> {

            LocaleManager.setNewLocale(MainActivity.this, "fa");
            startActivity(new Intent(MainActivity.this,SecondActivity.class));
        });


        btnNext.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,SecondActivity.class)));

    }


}
