package com.example.recyclerview_intheclass;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    private TextView mainText;
    IOnClickListener listener;

    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);

        mainText = itemView.findViewById(R.id.vhm_main_text);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(mainText.getText().toString());
            }
        });
    }

    public void setText(String text) {
        mainText.setText(text);
    }
}
