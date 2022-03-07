package com.wposs.simpappstore;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wposs.simpappstore.databinding.FragmentAppsBinding;

public class AppsFragment extends Fragment {

    private FragmentAppsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAppsBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }
}