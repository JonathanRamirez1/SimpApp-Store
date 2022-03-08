package com.wposs.simpappstore.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.wposs.simpappstore.data.AppsModel;
import com.wposs.simpappstore.databinding.ItemAppsBinding;

import java.util.List;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.AppsHolder> {

    private List<AppsModel> itemsAppsModel;

    public AppsAdapter(List<AppsModel> itemsAppsModel) {
        this.itemsAppsModel = itemsAppsModel;
    }

    @NonNull
    @Override
    public AppsAdapter.AppsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemAppsBinding itemAppsBinding = ItemAppsBinding.inflate(layoutInflater, parent, false);
        return new AppsHolder(itemAppsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AppsAdapter.AppsHolder holder, int position) {
        AppsModel appsModel = itemsAppsModel.get(position);
        holder.render(appsModel);
    }

    @Override
    public int getItemCount() {
        return itemsAppsModel.size();
    }

    public class AppsHolder extends RecyclerView.ViewHolder {

        private ItemAppsBinding binding;

        public final void render(AppsModel appsModel) {
            ImageView icon = binding.imageViewIconApps;
            TextView name = binding.textViewNameGames;
            TextView size = binding.textViewSizeGames;

            icon.setImageResource(appsModel.getIcon());
            name.setText(appsModel.getName());
            size.setText(appsModel.getSizeApp());
        }
        public AppsHolder(@NonNull ItemAppsBinding binding) {
            super((View) binding.getRoot());
            this.binding = binding;
        }
    }
}
