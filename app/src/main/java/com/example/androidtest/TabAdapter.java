package com.example.androidtest;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter {

    public static String[] TITLES = new String[]{"关注","问答","需求","技术","资讯"};

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        TabFragment fragment = new TabFragment(i);
        return fragment;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}
