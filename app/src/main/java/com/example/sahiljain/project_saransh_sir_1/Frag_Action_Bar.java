package com.example.sahiljain.project_saransh_sir_1;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Sahil Jain on 05-01-2017.
 */

public class Frag_Action_Bar extends Fragment {

    ImageView imageview;
    int pos;
    int image_list[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};

    public Frag_Action_Bar(){}//Constructor with no arguments

    public Frag_Action_Bar(int position){
        pos = position;
    }//Constructor


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup Container, Bundle SavedInstanceState){

        View V= inflater.inflate(R.layout.frag_ac_bar,Container, false);
        imageview = (ImageView) V.findViewById(R.id.frag_ac_bar_image1);

        imageview.setImageResource(image_list[pos]);

        return V;

    }//onCreateView()

}//Class