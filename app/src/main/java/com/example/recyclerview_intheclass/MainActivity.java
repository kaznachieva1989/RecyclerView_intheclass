package com.example.recyclerview_intheclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements IOnClickListener {
    MainAdapter adapter;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        adapter = new MainAdapter();
        adapter.listener = this;
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void openSecond(String text) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("students_name", text);
        startActivity(intent);
    }

    @Override
    public void onClick(String s) {
        openSecond(s);
    }

    public void addNewText(View v) {
        adapter.addText(editText.getText().toString());
    }
}
