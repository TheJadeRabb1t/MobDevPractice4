package com.example.mobdevpractice4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ChoosingFragment extends Fragment {

    public ChoosingFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choosing, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button listViewButton = view.findViewById(R.id.listViewButton);
        Button recyclerViewButton = view.findViewById(R.id.recyclerViewButton);
        listViewButton.setOnClickListener(view1 -> {
            ListViewFragment listViewFragment = ListViewFragment.newInstance();
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, listViewFragment)
                    .addToBackStack(null)
                    .commit();
        });
        recyclerViewButton.setOnClickListener(view1 -> {
            RecyclerViewFragment recyclerViewFragment = RecyclerViewFragment.newInstance();
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, recyclerViewFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}