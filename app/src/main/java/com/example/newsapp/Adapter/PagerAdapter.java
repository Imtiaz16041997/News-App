package com.example.newsapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.newsapp.Fragment.EntertainmentFragment;
import com.example.newsapp.Fragment.HealthFragment;
import com.example.newsapp.Fragment.HomeFragment;
import com.example.newsapp.Fragment.ScienceFragment;
import com.example.newsapp.Fragment.SportsFragment;
import com.example.newsapp.Fragment.TechnologyFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm,int behavior) {
        super(fm);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0: return new HomeFragment();

            case 1: return new SportsFragment();

            case 2: return new HealthFragment();

            case 3: return new ScienceFragment();

            case 4: return new EntertainmentFragment();

            case 5: return new TechnologyFragment();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
