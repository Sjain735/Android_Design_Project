package com.example.sahiljain.project_saransh_sir_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sahil Jain on 08-01-2017.
 */

public class Frag_act2 extends Fragment {

    RecyclerView r_list;
    Act2_RecyclerAdapter recyclerAdapter;

    public Frag_act2()
    {
        //Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup Container, Bundle SavedInstanceState)
    {
        View V = inflater.inflate(R.layout.frag_act2,Container, false);

        r_list = (RecyclerView) V.findViewById(R.id.frag_act2_recyclerView);
        recyclerAdapter = new Act2_RecyclerAdapter(getContext());
        r_list.setAdapter(recyclerAdapter);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        r_list.setLayoutManager(llm);

        return V;
    }//onCreateView()

}//Class
