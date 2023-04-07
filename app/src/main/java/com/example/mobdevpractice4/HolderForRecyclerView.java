package com.example.mobdevpractice4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderForRecyclerView extends RecyclerView.ViewHolder{
    public TextView textView;
    public ImageView imageView;

    public HolderForRecyclerView(@NonNull View itemView) {
        super(itemView);
        this.textView = itemView.findViewById(R.id.hotelName);
        this.imageView = itemView.findViewById(R.id.housePic);
    }
}
