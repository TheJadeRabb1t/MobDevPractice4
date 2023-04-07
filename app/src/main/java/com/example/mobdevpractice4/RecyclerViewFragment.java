package com.example.mobdevpractice4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private List<Item> hotels = new ArrayList<>();

    public RecyclerViewFragment() {
    }

    public static RecyclerViewFragment newInstance() {
        RecyclerViewFragment fragment = new RecyclerViewFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewLayout);
        RecyclerViewAdapter.MyOnItemClickListener listener = (hotel, position) -> {
            Log.i("RecyclerView", "Selected item " + position);
            Toast.makeText(getContext(), "Selected item " + position, Toast.LENGTH_SHORT).show();
        };
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        for(int i = 0; i < 200; i++){
            hotels.add(new Item("Liked hotel name", R.drawable.house_image));
        }
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(hotels, listener);
        recyclerView.setAdapter(adapter);
    }
}