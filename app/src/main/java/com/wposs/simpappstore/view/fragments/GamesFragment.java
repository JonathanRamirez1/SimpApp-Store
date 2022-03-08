package com.wposs.simpappstore.view.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wposs.simpappstore.data.GamesModel;
import com.wposs.simpappstore.R;
import com.wposs.simpappstore.view.adapters.GamesAdapter;
import com.wposs.simpappstore.databinding.FragmentGamesBinding;

import java.util.ArrayList;

public class GamesFragment extends Fragment {

    private FragmentGamesBinding binding;
    private GamesAdapter gamesAdapter;
    private ArrayList<GamesModel> itemsPopularityGamesModel;
    private ArrayList<GamesModel> itemsAdsGamesModel;
    private ArrayList<GamesModel> itemsGamesGamesModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGamesBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapterWelcomeGames();
        setAdapterAdsGames();
        setGamesAdapterGames();
    }

    private void setAdapterWelcomeGames() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewHome.setLayoutManager(layoutManager);
        itemsPopularityGamesModel = new ArrayList<>();
        gamesAdapter = new GamesAdapter(itemsPopularityGamesModel);
        binding.recyclerViewHome.setHasFixedSize(true);
        binding.recyclerViewHome.setAdapter(gamesAdapter);
        setItemsWelcomeGames();
    }

    private void setItemsWelcomeGames() {
        for (int i = 0; i < 10; i++) {
            itemsPopularityGamesModel.add(i, new GamesModel(
                    R.drawable.whats,
                    R.drawable.ic_whats,
                    "WhatsApp Messenger",
                    "Communication",
                    "4,2",
                    R.drawable.ic_start,
                    "31 MB"));
        }
    }

    private void setAdapterAdsGames() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewAdsHome.setLayoutManager(layoutManager);
        itemsAdsGamesModel = new ArrayList<>();
        gamesAdapter = new GamesAdapter(itemsAdsGamesModel);
        binding.recyclerViewAdsHome.setHasFixedSize(true);
        binding.recyclerViewAdsHome.setAdapter(gamesAdapter);
        setItemsAdsGames();
    }

    private void setItemsAdsGames() {
        for (int i = 0; i < 10; i++) {
            itemsAdsGamesModel.add(i, new GamesModel(
                    R.drawable.ic_cover_face,
                    R.drawable.ic_face,
                    "Facebook Messenger",
                    "Communication",
                    "4,3",
                    R.drawable.ic_start,
                    "125 MB"));
        }
    }

    private void setGamesAdapterGames() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewGamesHome.setLayoutManager(layoutManager);
        itemsGamesGamesModel = new ArrayList<>();
        gamesAdapter = new GamesAdapter(itemsGamesGamesModel);
        binding.recyclerViewGamesHome.setHasFixedSize(true);
        binding.recyclerViewGamesHome.setAdapter(gamesAdapter);
        setItemsPopularityGames();
    }

    private void setItemsPopularityGames() {
        for (int i = 0; i < 10; i++) {
            itemsGamesGamesModel.add(i, new GamesModel(
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