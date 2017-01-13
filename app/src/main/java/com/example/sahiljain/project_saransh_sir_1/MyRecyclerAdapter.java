package com.example.sahiljain.project_saransh_sir_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sahil Jain on 06-01-2017.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    Context r_context;
    int count = 2;  //To return the number of Items present in Recycler View
    int type_card = 1;

    public MyRecyclerAdapter (Context context){
        r_context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_1, parent, false);
        ViewHolder vItem = new ViewHolder(v, viewType, parent.getContext());

        return vItem;
    }//onCreateViewHolder()

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setIsRecyclable(false);

        //Set Images And Position Here

    }//onBindViewHolder()

    @Override
    public int getItemCount() {
        return count;
    }

    public int getItemViewType(int position){
        return type_card;
    }


    //ViewHolder Class
    public class ViewHolder extends RecyclerView.ViewHolder {

        int HolderId = 1;
        TextView t_1_1, t_1_2, t_1_3, t_1_4, t_2_1, t_2_2, t_2_3, t_2_4, t_card_heading, t_card_more;
        ImageView img_1, img_2, img_3, img_4;

        public ViewHolder(View itemView, int item_type, final Context context) {
            super(itemView);

            if (item_type == type_card){

                t_1_1 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_1_text_1);
                t_1_2 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_2_text_1);
                t_1_3 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_3_text_1);
                t_1_4 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_4_text_1);

                t_2_1 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_1_text_2);
                t_2_2 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_2_text_2);
                t_2_3 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_3_text_2);
                t_2_4 = (TextView) itemView.findViewById(R.id.item1_cardView_inner_4_text_2);

                t_card_heading = (TextView) itemView.findViewById(R.id.item1_text_1);
                t_card_more = (TextView) itemView.findViewById(R.id.item1_text_2);

                img_1 = (ImageView) itemView.findViewById(R.id.item1_cardView_inner_1_image);
                img_2 = (ImageView) itemView.findViewById(R.id.item1_cardView_inner_2_image);
                img_3 = (ImageView) itemView.findViewById(R.id.item1_cardView_inner_3_image);
                img_4 = (ImageView) itemView.findViewById(R.id.item1_cardView_inner_4_image);

                //Using the MORE TextView to open Second Page
                t_card_more.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(r_context,Second_Page.class);
                        r_context.startActivity(i);
                    }
                });

                HolderId = 1;
            }//if
        }//Constructor
    }//ViewHolder Class


}//MyRecyclerAdaterClass
