package com.example.androidtest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.viewpagerindicator.TabPageIndicator;

public class homepageActivity extends FragmentActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    private TabPageIndicator mTabPageIndicator;
    private TabAdapter mAdapter;

    private Fragment mTab01;
    private Fragment mTab02;
    private Fragment mTab03;
    private Fragment mTab04;
    private Fragment mTab05;

    //TAB
    private LinearLayout mHomepageTab;
    private LinearLayout mConsultationTab;
    private LinearLayout mPublishTab;
    private LinearLayout mInformationTab;
    private LinearLayout mPeopleTab;

    //Imagebutton
    private ImageButton mHomepage;
    private ImageButton mConsultation;
    private ImageButton mPublish;
    private ImageButton mInformation;
    private ImageButton mPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_homepage);

        initView();
        initEvents();
        setSelect(0);
    }

    private void initEvents() {
        mHomepageTab.setOnClickListener(this);
        mConsultationTab.setOnClickListener(this);
        mPublishTab.setOnClickListener(this);
        mInformationTab.setOnClickListener(this);
        mPeopleTab.setOnClickListener(this);
    }

    private void initView() {
        //tabs初始化
        mHomepageTab = findViewById(R.id.homepage_tab);
        mConsultationTab = findViewById(R.id.consultation_tab);
        mPublishTab = findViewById(R.id.public_tab);
        mInformationTab = findViewById(R.id.information_tab);
        mPeopleTab = findViewById(R.id.people_tab);
        //ImageButtons初始化
        mHomepage = findViewById(R.id.homepage_img);
        mConsultation = findViewById(R.id.consultation_img);
        mPublish = findViewById(R.id.public_img);
        mInformation = findViewById(R.id.information_img);
        mPeople = findViewById(R.id.people_img);
    }

    private void setSelect(int i) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        //把图片设置为亮的
        //设置内容区域
        switch (i) {
            case 0:
                if (mTab01 == null) {
                    mTab01 = new homepageSlidetabFragment();
                    fragmentTransaction.add(R.id.id_content, mTab01);
                } else {
                    fragmentTransaction.show(mTab01);
                }
                mHomepage.setImageResource(R.drawable.homepage_pressed);
                break;
            case 1:
                if (mTab02 == null) {
                    mTab02 = new consultationActivity();
                    fragmentTransaction.add(R.id.id_content, mTab02);
                } else {
                    fragmentTransaction.show(mTab02);
                }
                mConsultation.setImageResource(R.drawable.consultation_pressed);
                break;
            case 2:
                if (mTab03 == null) {
                    mTab03 = new publishFragment();
                    fragmentTransaction.add(R.id.id_content, mTab03);
                } else {
                    fragmentTransaction.show(mTab03);
                }
                mPublish.setImageResource(R.drawable.publish);
                break;
            case 3:
                if (mTab04 == null) {
                    mTab04 = new informationActivity();
                    fragmentTransaction.add(R.id.id_content, mTab04);
                } else {
                    fragmentTransaction.show(mTab04);
                }
                mInformation.setImageResource(R.drawable.information_pressed);
                break;
            case 4:
                if (mTab05 == null) {
                    mTab05 = new peopleActivity();
                    fragmentTransaction.add(R.id.id_content, mTab05);
                } else {
                    fragmentTransaction.show(mTab05);
                }
                mPeople.setImageResource(R.drawable.people_pressed);
                break;
            default:
                break;
        }

        fragmentTransaction.commit();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if (mTab01 != null) {
            fragmentTransaction.hide(mTab01);
        }
        if (mTab02 != null) {
            fragmentTransaction.hide(mTab02);
        }
        if (mTab03 != null) {
            fragmentTransaction.hide(mTab03);
        }
        if (mTab04 != null) {
            fragmentTransaction.hide(mTab04);
        }
        if (mTab05 != null) {
            fragmentTransaction.hide(mTab05);
        }
    }

    @Override
    public void onClick(View v) {
        resetImg();
        switch (v.getId()) {
            case R.id.homepage_tab:
                setSelect(0);
                mViewPager = (ViewPager) findViewById(R.id.id_viewpager);
                mTabPageIndicator = (TabPageIndicator) findViewById(R.id.id_indicator);
                mAdapter = new TabAdapter(getSupportFragmentManager());
                mViewPager.setAdapter(mAdapter);
                mTabPageIndicator.setVisibility(View.VISIBLE);
                mTabPageIndicator.setViewPager(mViewPager,0);
                break;
            case R.id.consultation_tab:
                setSelect(1);
                break;
            case R.id.public_tab:
                setSelect(2);
                break;
            case R.id.information_tab:
                setSelect(3);
                break;
            case R.id.people_tab:
                setSelect(4);
                break;

            default:
                break;
        }
    }

    //将所有的图片切换为暗色
    private void resetImg() {
        mHomepage.setImageResource(R.drawable.homepage);
        mConsultation.setImageResource(R.drawable.consultation);
        mPublish.setImageResource(R.drawable.publish);
        mInformation.setImageResource(R.drawable.information);
        mPeople.setImageResource(R.drawable.people);
    }
}
