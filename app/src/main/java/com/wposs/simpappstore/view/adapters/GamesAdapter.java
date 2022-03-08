package com.wposs.simpappstore.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.wposs.simpappstore.data.GamesModel;
import com.wposs.simpappstore.databinding.ItemGamesBinding;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GamesHolder> {

    private List<GamesModel> itemsGamesModel;

    public GamesAdapter(List<GamesModel> itemsGamesModel) {
        this.itemsGamesModel = itemsGamesModel;
    }

    @NonNull
    @Override
    public GamesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemGamesBinding itemGamesBinding = ItemGamesBinding.inflate(layoutInflater, parent, false);
        return new GamesHolder(itemGamesBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesHolder holder, int position) {
        GamesModel gamesModel = itemsGamesModel.get(position);
        holder.render(gamesModel);
    }

    @Override
    public int getItemCount() {
        return this.itemsGamesModel.size();
    }

    //TODO verificar si sirve para algo, sino borrar
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public static final class GamesHolder extends RecyclerView.ViewHolder {

        private final ItemGamesBinding binding;

        public final void render(GamesModel gamesModel) {
            ImageView cover = binding.imageViewCoverGames;
            ImageView iconApp = binding.imageViewRoundedIconGames;
            TextView name = binding.textViewNameGames;
            TextView category = binding.textViewCategoryGames;
            TextView countStar = binding.textViewStarGames;
            ImageView star = binding.imageViewStarGames;
            TextView sizeApp = binding.textViewSizeGames;

            cover.setImageResource(gamesModel.getCover());
            iconApp.setImageResource(gamesModel.getIcon());
            name.setText(gamesModel.getName());
            category.setText(gamesModel.getCategory());
            countStar.setText(gamesModel.getCountStar());
            star.setImageResource(gamesModel.getStar());
            sizeApp.setText(gamesModel.getSizeApp());
        }

        public final ItemGamesBinding getBinding() {
            return this.binding;
        }

        public GamesHolder(@NonNull ItemGamesBinding binding) {
            super((View) binding.getRoot());
            this.binding = binding;
        }
    }
}