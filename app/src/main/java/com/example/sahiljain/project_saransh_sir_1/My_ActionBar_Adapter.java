package com.example.sahiljain.project_saransh_sir_1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sahil Jain on 05-01-2017.
 */

public class My_ActionBar_Adapter extends FragmentPagerAdapter {

    private int count = 5;

    public My_ActionBar_Adapter(FragmentManager fm) {
        super(fm);
    }//Constructor

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = new Frag_Action_Bar(position);
        return fragment;

    }//getItem()

    @Override
    public int getCount() {
        return count;
    }//getCount()

}//CLass
