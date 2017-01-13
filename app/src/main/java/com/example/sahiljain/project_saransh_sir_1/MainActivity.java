package com.example.sahiljain.project_saransh_sir_1;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    ViewPager pager;
    ViewPager actionbar_pager;
    Toolbar toolbar;
    TabLayout tabLayout;
    TextView toolbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar_title = (TextView) findViewById(R.id.main_toolbar_title);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/helvetica.ttf");
        toolbar_title.setTypeface(type);

        //Code For Adding Fragments in ActionBar
        actionbar_pager = (ViewPager) findViewById(R.id.main_pager_actionbar);
        My_ActionBar_Adapter myadapter = new My_ActionBar_Adapter(getSupportFragmentManager());
        actionbar_pager.setAdapter(myadapter);
        //Fragments End

        //Code For Adding Fragments in Main Activity
        pager = (ViewPager) findViewById(R.id.main_pager);
        MyPagerAdapter madapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(madapter);
        //Fragments End

        tabLayout = (TabLayout) findViewById(R.id.main_tabs);
        tabLayout.setupWithViewPager(pager);
        setupTabIcons();
        tabLayout.setOnTabSelectedListener(this);

        onTabUnselected(tabLayout.getTabAt(3));
        onTabUnselected(tabLayout.getTabAt(2));
        onTabUnselected(tabLayout.getTabAt(1));
        onTabSelected(tabLayout.getTabAt(0));

    }//onCreate()

    private void setupTabIcons(){
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_delete_white_48dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_settings_white_48dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_undo_white_48dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_save_white_48dp);
    }//setupTabIcons()

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        int tabIconColor;
        int position = tabLayout.getSelectedTabPosition();
        int color_list[] = {R.color.tabColor1, R.color.tabColor2, R.color.tabColor3, R.color.tabColor4};
        int tab_background_list[] = {R.drawable.main_toolbar_color1, R.drawable.main_toolbar_color2,
                                             R.drawable.main_toolbar_color3, R.drawable.main_toolbar_color4};

        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(color_list[position]));

        tabIconColor = ContextCompat.getColor(getApplicationContext(), color_list[position]);
        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

        tabLayout.setBackgroundResource(tab_background_list[position]);

    }//onTabSelected()

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

        int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.tabIcons);
        tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

    }//onTabUnselected()

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }//onTabReselected()

}//Main Class
