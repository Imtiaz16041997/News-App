package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import com.example.newsapp.Adapter.PagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem tabHome,tabScience,tabHealth, tabTechnology,tabEntertainment,tabSports;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;
    ViewPager viewPager2;

    String api = "be1902a8ea584d5a80131cb5f2fac899";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabHome = findViewById(R.id.home);
        tabScience = findViewById(R.id.science);
        tabHealth = findViewById(R.id.health);
        tabTechnology = findViewById(R.id.technology);
        tabEntertainment = findViewById(R.id.entertainment);
        tabSports = findViewById(R.id.sports);



        tabLayout = findViewById(R.id.include);
        viewPager2 = findViewById(R.id.fragmentcontainer);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);
        viewPager2.setAdapter(pagerAdapter);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0 || tab.getPosition()==1 ||tab.getPosition()==2 || tab.getPosition()==3 ||tab.getPosition()==4 ||tab.getPosition()== 5)
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager2.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}