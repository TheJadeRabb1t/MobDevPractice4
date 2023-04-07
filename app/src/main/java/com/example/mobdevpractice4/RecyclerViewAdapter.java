package com.example.mobdevpractice4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<HolderForRecyclerView>{
    private List<Item> hotels;

    interface MyOnItemClickListener{
        void onClick(Item hotel, int position);
    }

    private final MyOnItemClickListener myOnItemClickListener;

    public RecyclerViewAdapter(List<Item> hotels, MyOnItemClickListener myOnItemClickListener){
        this.hotels = hotels;
        this.myOnItemClickListener = myOnItemClickListener;
    }
    @NonNull
    @Override
    public HolderForRecyclerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_container, parent, false);
        HolderForRecyclerView viewHolder = new HolderForRecyclerView(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderForRecyclerView holder, int position) {
        Item hotel = hotels.get(position);
        holder.textView.setText(hotel.getHotelName());
        holder.imageView.setImageResource(hotel.getImageId());
        holder.itemView.setOnClickListener(v -> {
            myOnItemClickListener.onClick(hotel, holder.getAdapterPosition());
        });
    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }
}
