package com.example.mobdevpractice4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Item> {
    private LayoutInflater inflater;

    private int layout;

    private List<Item> hotels;

    static class ViewHolder {
        TextView textView;

        ImageView imageView;
    }

    public ListViewAdapter(Context context, int resource, List<Item> hotels){
        super(context, resource, hotels);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.hotels = hotels;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(this.layout, parent, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.hotelName);
            holder.imageView = convertView.findViewById(R.id.housePic);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Item hotel = hotels.get(position);
        holder.textView.setText(hotel.getHotelName());
        holder.imageView.setImageResource(hotel.getImageId());
        return convertView;
    }
}
