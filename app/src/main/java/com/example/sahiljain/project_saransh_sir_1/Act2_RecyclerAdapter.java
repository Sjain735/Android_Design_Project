package com.example.sahiljain.project_saransh_sir_1;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sahil Jain on 08-01-2017.
 */


public class Act2_RecyclerAdapter extends RecyclerView.Adapter<Act2_RecyclerAdapter.ViewHolder> {

    Context r_context;
    int count = 2;  //To return the number of Items present in Recycler View
    int type_card = 1;

    public Act2_RecyclerAdapter (Context context){
        r_context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.act2_recycler_item_1, parent, false);
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
        TextView t_1, t_2, t_3, t_4, t_5, t_6, t_7, t_8, t_9, t_card_heading, t_card_more;
        TextView tsub_1, tsub_2, tsub_3, tsub_4, tsub_5, tsub_6, tsub_7, tsub_8, tsub_9;
        ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_9, img_icon;

        public ViewHolder(View itemView, int item_type, final Context context) {
            super(itemView);

            if (item_type == type_card){

                t_card_heading = (TextView) itemView.findViewById(R.id.act2_item1_text_1);
                t_card_more = (TextView) itemView.findViewById(R.id.act2_item1_text_2);

                t_1 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_1_text_1);
                t_2 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_2_text_1);
                t_3 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_3_text_1);
                t_4 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_4_text_1);
                t_5 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_5_text_1);
                t_6 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_6_text_1);
                t_7 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_7_text_1);
                t_8 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_8_text_1);
                t_9 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_9_text_1);

                tsub_1 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_1_text_2);
                tsub_2 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_2_text_2);
                tsub_3 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_3_text_2);
                tsub_4 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_4_text_2);
                tsub_5 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_5_text_2);
                tsub_6 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_6_text_2);
                tsub_7 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_7_text_2);
                tsub_8 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_8_text_2);
                tsub_9 = (TextView) itemView.findViewById(R.id.act2_item1_cardView_inner_9_text_2);

                img_1 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_1_image);
                img_2 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_2_image);
                img_3 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_3_image);
                img_4 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_4_image);
                img_5 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_5_image);
                img_6 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_6_image);
                img_7 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_7_image);
                img_8 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_8_image);
                img_9 = (ImageView) itemView.findViewById(R.id.act2_item1_cardView_inner_9_image);

                img_icon = (ImageView) itemView.findViewById(R.id.act2_item1_img_icon);

                int IconColor = ContextCompat.getColor(r_context, R.color.tabColor1);
                img_icon.setColorFilter(IconColor, PorterDuff.Mode.SRC_IN);

                HolderId = 1;
            }//if
        }//Constructor
    }//ViewHolder Class

}//MyRecyclerAdaterClass

