package com.example.proworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

/**
 * Recycler view for workout plans.
 */
public class Workouts extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter recyclerAdapter;
    String[] titles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts);

        titles = getIntent().getStringArrayExtra("a");
        recyclerView = findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new FbRecyclerAdapter(titles);
        recyclerView.setAdapter(recyclerAdapter);
    }


}