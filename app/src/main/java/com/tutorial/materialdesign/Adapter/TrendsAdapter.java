package com.tutorial.materialdesign.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TrendsAdapter extends RecyclerView.Adapter<TrendsAdapter.Viewholder> {
    @NonNull
    @Override
    public TrendsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TrendsAdapter.Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView title, subtitle;
        ImageView pic;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
