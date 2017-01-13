package com.example.sahiljain.project_saransh_sir_1;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Second_Page extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    TextView txt_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        txt_title = (TextView) findViewById(R.id.act2_ToolBar_Title);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/helvetica.ttf");
        txt_title.setTypeface(type);

        //Code For Adding Fragments in Second Page Activity
        viewPager = (ViewPager) findViewById(R.id.act2_pager);
        SecondPagerAdapter myAdapter = new SecondPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
        //Fragments End

        tabLayout = (TabLayout) findViewById(R.id.act2_tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(this);

        onTabSelected(tabLayout.getTabAt(0));
    }//onCreate()

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.act2_TabColor1));
        tabLayout.setTabTextColors(getResources().getColor(R.color.act2_TabColor2),getResources().getColor(R.color.act2_TabColor1));

    }//onTabSelected()

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.act2_TabColor2));
    }//onTabUnselected()

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}//Class