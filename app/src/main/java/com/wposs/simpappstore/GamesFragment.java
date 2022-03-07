package com.wposs.simpappstore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wposs.simpappstore.databinding.ActivityHomeBinding;
import com.wposs.simpappstore.databinding.FragmentGamesBinding;

import java.util.ArrayList;

public class GamesFragment extends Fragment {

    private FragmentGamesBinding binding;
    private HomeAdapter homeAdapter;
    private ArrayList<Home> itemsPopularityHome;
    private ArrayList<Home> itemsAdsHome;
    private ArrayList<Home> itemsGamesHome;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGamesBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setHomeAdapter();
        setHomeAdapterAds();
        setHomeAdapterGames();
    }

    private void setHomeAdapter() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewHome.setLayoutManager(layoutManager);
        itemsPopularityHome = new ArrayList<>();
        homeAdapter = new HomeAdapter(itemsPopularityHome);
        binding.recyclerViewHome.setHasFixedSize(true);
        binding.recyclerViewHome.setAdapter(homeAdapter);
        setItemsPopularityHome();
    }

    private void setItemsPopularityHome() {
        for (int i = 0; i < 10; i++) {
            itemsPopularityHome.add(i, new Home(
                    R.drawable.whats,
                    R.drawable.ic_whats,
                    "WhatsApp Messenger",
                    "Communication",
                    "4,2",
                    R.drawable.ic_start,
                    "31 MB"));
        }
    }

    private void setHomeAdapterAds() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewAdsHome.setLayoutManager(layoutManager);
        itemsAdsHome = new ArrayList<>();
        homeAdapter = new HomeAdapter(itemsAdsHome);
        binding.recyclerViewAdsHome.setHasFixedSize(true);
        binding.recyclerViewAdsHome.setAdapter(homeAdapter);
        setItemsAdsHome();
    }

    private void setItemsAdsHome() {
        for (int i = 0; i < 10; i++) {
            itemsAdsHome.add(i, new Home(
                    R.drawable.ic_cover_face,
                    R.drawable.ic_face,
                    "Facebook Messenger",
                    "Communication",
                    "4,3",
                    R.drawable.ic_start,
                    "125 MB"));
        }
    }

    private void setHomeAdapterGames() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewGamesHome.setLayoutManager(layoutManager);
        itemsGamesHome = new ArrayList<>();
        homeAdapter = new HomeAdapter(itemsGamesHome);
        binding.recyclerViewGamesHome.setHasFixedSize(true);
        binding.recyclerViewGamesHome.setAdapter(homeAdapter);
        setItemsGamesHome();
    }

    private void setItemsGamesHome() {
        for (int i = 0; i < 10; i++) {
            itemsGamesHome.add(i, new Home(
                    R.drawable.ic_call_cover,
                    R.drawable.ic_call,
                    "Call Of Dutty Mobile",
                    "Estrategia",
                    "5",
                    R.drawable.ic_start,
                    "3 GB"));
        }
    }
}