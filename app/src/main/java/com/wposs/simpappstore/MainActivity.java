package com.wposs.simpappstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.wposs.simpappstore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        animation();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplication(), HomeActivity.class);
                startActivity(intent);
            }
        }, 3800);
    }

    private void animation() {
        binding.lottieAnimationViewSplash.animate().translationY(-1500F).setDuration(1000).setStartDelay(2000);
        binding.textViewSimpAppStore.animate().translationYBy(1000F).setDuration(1000).setStartDelay(2500);

        Animation animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        binding.textViewSimpAppStore.setAnimation(animationSlideUp);

        Animation animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        binding.linearLayoutSplash.setAnimation(animationSlideDown);
        binding.linearLayoutSplash.animate().translationY(1000F).setDuration(1000).setStartDelay(2500);
    }
}