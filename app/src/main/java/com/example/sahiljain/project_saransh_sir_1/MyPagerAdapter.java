package com.example.sahiljain.project_saransh_sir_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sahil Jain on 04-01-2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    int count = 4;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }//constructor

    @Override
    public Fragment getItem(int position) {

        Fragment fm = new Frag1();
        return fm;

    }//getItem()

    @Override
    public CharSequence getPageTitle(int position){
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }//getCount()

}//Class
