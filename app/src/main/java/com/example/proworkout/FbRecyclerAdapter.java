package com.example.proworkout;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

/**
 * Basic recycler adapter implementation that displays list of days of each workout plan that is chosen.
 */
public class FbRecyclerAdapter extends RecyclerView.Adapter<FbRecyclerAdapter.ViewHolder> {
    private String[] titles;
    private int img = R.drawable.dumbell;

    /**
     * Constructor
     * @param titles
     */
    public FbRecyclerAdapter(String[] titles){
        this.titles = titles;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        ImageView itemImage;
        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemImage = itemView.findViewById(R.id.item_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }
    }
    @Override
    public FbRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_layout,parent,false);
        FbRecyclerAdapter.ViewHolder holder = new FbRecyclerAdapter.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(FbRecyclerAdapter.ViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemImage.setImageResource(img);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}