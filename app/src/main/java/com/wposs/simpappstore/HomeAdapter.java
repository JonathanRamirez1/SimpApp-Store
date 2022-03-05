package com.wposs.simpappstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wposs.simpappstore.databinding.ItemHomeBinding;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeHolder> {

    private List list;

    public HomeAdapter(List list) {
        this.list = list;
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
        list.get(position);
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public static final class HomeHolder extends RecyclerView.ViewHolder {

        private final ItemHomeBinding binding;

        public final void render(Home home) {
            binding.getRoot().setOnClickListener(view -> {
                //TODO IMPLEMENT
            });
        }

        public final  ItemHomeBinding getBinding() {
            return this.binding;
        }
        public HomeHolder(@NonNull ItemHomeBinding binding) {
            super((View)binding.getRoot());
            this.binding = binding;

          //  binding.imageViewCoverApp.setImageDrawable();
        }
    }
}
