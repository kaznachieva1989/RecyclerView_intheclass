package com.example.recyclerview_intheclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<String> data;

    public MainAdapter() {
        data = new ArrayList<>();
        data.add("Nurzhamal");
        data.add("Zair");
        data.add("Agahan");
    }

    IOnClickListener listener;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(v);
        mainViewHolder.listener = listener;
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addText(String text) {
        data.add(text);
        notifyDataSetChanged();
    }
}
