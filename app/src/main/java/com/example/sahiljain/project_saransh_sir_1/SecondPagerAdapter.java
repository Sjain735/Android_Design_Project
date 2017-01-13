package com.example.sahiljain.project_saransh_sir_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sahil Jain on 08-01-2017.
 */

public class SecondPagerAdapter extends FragmentPagerAdapter {

    int count = 4;
    CharSequence Page_Title[] = {"BOLLYWOOD","HOLLYWOOD","TOLLYWOOD","BOLLYWOOD"};

    public SecondPagerAdapter (FragmentManager fm) {
        super(fm);
    }//constructor

    @Override
    public Fragment getItem(int position) {

        Fragment fm = new Frag_act2();
        return fm;

    }//getItem()

    @Override
    public CharSequence getPageTitle(int position){
        return Page_Title[position];
    }

    @Override
    public int getCount() {
        return count;
    }//getCount()

}//Class
