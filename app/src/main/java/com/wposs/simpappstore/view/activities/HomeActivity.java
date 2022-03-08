package com.wposs.simpappstore.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.MenuItem;

import com.wposs.simpappstore.R;
import com.wposs.simpappstore.view.adapters.PagerAdapter;
import com.wposs.simpappstore.databinding.ActivityHomeBinding;
import com.wposs.simpappstore.view.fragments.AppsFragment;
import com.wposs.simpappstore.view.fragments.GamesFragment;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private MenuItem previewBottomSelected = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /** Toolbar **/
      /*  setSupportActionBar(findViewById(R.id.toolbarView));*/

        setUpViewPager(getPagerAdapter());
        setUpBottomNavigationBar();
    }

    private PagerAdapter getPagerAdapter() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new GamesFragment());
        pagerAdapter.addFragment(new AppsFragment());
        return pagerAdapter;
    }

    private void setUpViewPager(PagerAdapter pagerAdapter) {
        binding.viewPager.setAdapter(pagerAdapter);
        binding.viewPager.setOffscreenPageLimit(pagerAdapter.getCount());
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int state) {}
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                if (previewBottomSelected == null) {
                    binding.bottomNavigation.getMenu().getItem(0).setChecked(false);
                } else {
                    previewBottomSelected.setChecked(false);
                }
                binding.bottomNavigation.getMenu().getItem(position).setChecked(true);
                previewBottomSelected = binding.bottomNavigation.getMenu().getItem(position);
            }
        });
    }

    private void setUpBottomNavigationBar() {
        binding.bottomNavigation.setOnNavigationItemSelectedListener(item -> {
            boolean state;
            switch (item.getItemId()) {
                case R.id.bottom_nav_games:
                    binding.viewPager.setCurrentItem(0);
                    state = true;
                    break;
                case R.id.bottom_nav_apps:
                    binding.viewPager.setCurrentItem(1);
                    state = true;
                    break;
                default: {
                    state = false;
                }
            }
            return state;
        });
    }
}