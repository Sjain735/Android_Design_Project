package com.example.sahiljain.project_saransh_sir_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 8/6/2016.
 */

public class Frag1 extends Fragment {

    RecyclerView r_list;
    MyRecyclerAdapter recyclerAdapter;

    public Frag1()
    {
        //Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup Container, Bundle SavedInstanceState)
    {
        View V = inflater.inflate(R.layout.frag1,Container, false);

        r_list = (RecyclerView) V.findViewById(R.id.frag1_recycler_view);
        recyclerAdapter = new MyRecyclerAdapter(getContext());
        r_list.setAdapter(recyclerAdapter);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        r_list.setLayoutManager(llm);

        return V;
    }//onCreateView()

    @Override
    public void onResume(){
        super.onResume();

        recyclerAdapter.notifyDataSetChanged();
    }//onResume()

}//Class Frag1

