package com.wposs.simpappstore.view.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wposs.simpappstore.R;
import com.wposs.simpappstore.data.AppsModel;
import com.wposs.simpappstore.data.GamesModel;
import com.wposs.simpappstore.databinding.FragmentAppsBinding;
import com.wposs.simpappstore.view.adapters.AppsAdapter;
import com.wposs.simpappstore.view.adapters.GamesAdapter;

import java.util.ArrayList;

public class AppsFragment extends Fragment {

    private FragmentAppsBinding binding;
    private AppsAdapter appsAdapter;
    private ArrayList<AppsModel> itemsWelcomeAppsModel;
    private ArrayList<AppsModel> itemsAdsAppsModel;
    private ArrayList<AppsModel> itemsPopularityAppsModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAppsBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setAdapterWelcomeApps();
    }

    private void setAdapterWelcomeApps() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewWelcomeApps.setLayoutManager(layoutManager);
        itemsWelcomeAppsModel = new ArrayList<>();
        appsAdapter = new AppsAdapter(itemsWelcomeAppsModel);
        binding.recyclerViewWelcomeApps.setHasFixedSize(true);
        binding.recyclerViewWelcomeApps.setAdapter(appsAdapter);
        setItemsWelcomeApps();
        setAdapterAdsApps();
        setAdapterPopularityApps();
    }

    private void setItemsWelcomeApps() {
        for (int i = 0; i < 10; i++) {
            itemsWelcomeAppsModel.add(i, new AppsModel(
                    R.drawable.ic_whats,
                    "WhatsApp Messenger",
                    "31 MB"));
        }
    }

    private void setAdapterAdsApps() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewAdsApps.setLayoutManager(layoutManager);
        itemsAdsAppsModel = new ArrayList<>();
        appsAdapter = new AppsAdapter(itemsAdsAppsModel);
        binding.recyclerViewAdsApps.setHasFixedSize(true);
        binding.recyclerViewAdsApps.setAdapter(appsAdapter);
        setItemsAdsApps();
    }

    private void setItemsAdsApps() {
        for (int i = 0; i < 10; i++) {
            itemsAdsAppsModel.add(i, new AppsModel(
                    R.drawable.ic_face,
                    "Facebook Messenger",
                    "125 MB"));
        }
    }

    private void setAdapterPopularityApps() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewPopularityApps.setLayoutManager(layoutManager);
        itemsPopularityAppsModel = new ArrayList<>();
        appsAdapter = new AppsAdapter(itemsPopularityAppsModel);
        binding.recyclerViewPopularityApps.setHasFixedSize(true);
        binding.recyclerViewPopularityApps.setAdapter(appsAdapter);
        setItemsPopularityApps();
    }

    private void setItemsPopularityApps() {
        for (int i = 0; i < 10; i++) {
            itemsPopularityAppsModel.add(i, new AppsModel(
                    R.drawable.ic_call,
                    "Call Of Dutty Mobile",
                    "3 GB"));
        }
    }
}