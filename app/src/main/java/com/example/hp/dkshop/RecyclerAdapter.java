package com.example.hp.dkshop;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 03-10-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    ArrayList<Modle> arrayList = new ArrayList<>();
    RecyclerAdapter(ArrayList<Modle> arrayList)
    {
        this.arrayList = arrayList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.modle_image.setImageResource(arrayList.get(position).getModle_id());
        holder.modle_name.setText(arrayList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {

        ImageView modle_image;
        TextView modle_name;

        public MyViewHolder(View itemView) {
            super(itemView);

            modle_image = (ImageView) itemView.findViewById(R.id.modle_image);
            modle_name = (TextView) itemView.findViewById(R.id.modle_number);

        }
    }
}
