package com.wposs.simpappstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.wposs.simpappstore.databinding.ActivityHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private HomeAdapter homeAdapter;
    private ArrayList<Home> itemsHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setHomeAdapter();
    }

    private void setHomeAdapter() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewHome.setLayoutManager(layoutManager);
        itemsHome = new ArrayList<>();
        homeAdapter = new HomeAdapter(itemsHome);
        binding.recyclerViewHome.setHasFixedSize(true);
        binding.recyclerViewHome.setAdapter(homeAdapter);
        setItemsHome();
    }

    private void setItemsHome() {
        for (int i = 0; i < 10; i++) {
            itemsHome.add(i, new Home(
                    R.drawable.whats,
                    R.drawable.ic_whats,
                    "Hola que hace",
                    "Hola",
                    "2",
                    R.drawable.ic_start,
                    "100 MB"));
        }
    }
}