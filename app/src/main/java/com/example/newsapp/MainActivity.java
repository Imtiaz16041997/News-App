package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Toolbar;


import com.example.newsapp.Adapter.PagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tabHome,tabScience,tabHealth, tabTechnology,tabEntertainment,tabSports;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);











    }
}