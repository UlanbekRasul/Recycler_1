package com.example.recycler_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> names = new ArrayList<>();
    private Adapter adapter;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        loadData();
        adapter = new Adapter(names);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
        names.add(new Model(R.drawable.ic_circle, "Rasul \n 0774881885"));
    }
}