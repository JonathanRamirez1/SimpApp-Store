package com.wposs.simpappstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wposs.simpappstore.databinding.ItemHomeBinding;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private List<Home> itemsHome;

    public HomeAdapter(List<Home> itemsHome) {
        this.itemsHome = itemsHome;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemHomeBinding itemHomeBinding = ItemHomeBinding.inflate(layoutInflater, parent, false);
        return new HomeHolder(itemHomeBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {
        Home home = itemsHome.get(position);
        holder.render(home);
    }

    @Override
    public int getItemCount() {
        return this.itemsHome.size();
    }

    public static final class HomeHolder extends RecyclerView.ViewHolder {

        private final ItemHomeBinding binding;

        public final void render(Home home) {
            ImageView cover = binding.imageViewCoverApp;
            ImageView iconApp = binding.imageViewRoundedIconApp;
            TextView name = binding.textViewNameApp;
            TextView category = binding.textViewCategoryApp;
            TextView countStar = binding.textViewStarApp;
            ImageView star = binding.imageViewStarApp;
            TextView sizeApp = binding.textViewSizeApp;

            cover.setImageResource(home.getCover());
            iconApp.setImageResource(home.getIcon());
            name.setText(home.getName());
            category.setText(home.getCategory());
            countStar.setText(home.getCountStar());
            star.setImageResource(home.getStar());
            sizeApp.setText(home.getSizeApp());
        }

        public final ItemHomeBinding getBinding() {
            return this.binding;
        }

        public HomeHolder(@NonNull ItemHomeBinding binding) {
            super((View) binding.getRoot());
            this.binding = binding;
        }
    }
}
