package com.example.myapplication.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public class CustomBaseActivity extends PersianAppcompatActivity {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleManager.setLocale(base));
    }
}
