package com.wposs.simpappstore.view.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

    private final ArrayList fragmentList;

    public PagerAdapter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
        this.fragmentList = new ArrayList();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return (Fragment) this.fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return this.fragmentList.size();
    }

    public final void  addFragment(@NonNull Fragment fragment) {
        this.fragmentList.add(fragment);
    }
}
