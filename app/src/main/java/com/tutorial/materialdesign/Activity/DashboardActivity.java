package com.tutorial.materialdesign.Activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tutorial.materialdesign.Adapter.TrendsAdapter;
import com.tutorial.materialdesign.Domain.TrendsDomain;
import com.tutorial.materialdesign.R;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterList;
    private RecyclerView recylerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> items = new ArrayList<>();

        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends" ));
        items.add(new TrendsDomain("Important points in conducting a work contract", "Reuters", "trends2" ));
        items.add(new TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends" ));

        recylerView = findViewById(R.id.recylerview);
        recylerView.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
        ));

        adapterList = new TrendsAdapter(items);
        recylerView.setAdapter(adapterList);
    }
}
