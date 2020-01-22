package com.example.recyclerview_intheclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if (getIntent().hasExtra("students_name")) {
            String name = getIntent().getStringExtra("students_name");
            if (name.equals("Nurzhamal")) {
                setStudentsName(name + " Kaznachieva" + " age: 30");
            }
            if (name.equals("Zair")) {
                setStudentsName(name + " Sulaimankulov" + " age: 36");
            }
            if (name.equals("Agahan")) {
                setStudentsName(name + " Zairbek uulu" + " age: 0.1");
            }
            if (!(name.equals("Nurzhamal") || name.equals("Zair") || name.equals("Agahan"))) {
                setStudentsName(" There`s no record");
            }
        }
    }

    private void setStudentsName(String name) {
        TextView sName = findViewById(R.id.name_text);
        sName.setText(name);
    }
}
