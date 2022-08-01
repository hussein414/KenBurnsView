package com.example.kenburnsview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kenburnsview.databinding.ItemCardBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder> {
    ArrayList<TravelModel> models;

    public TravelAdapter( ArrayList<TravelModel> models ) {
        this.models = models;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        return new TravelViewHolder(ItemCardBinding.inflate
                (LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder( @NonNull TravelViewHolder holder, int position ) {
        holder.setLocationDate(models.get(position));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    static class TravelViewHolder extends RecyclerView.ViewHolder {
        private ItemCardBinding binding;

        public TravelViewHolder( @NonNull ItemCardBinding binding ) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void setLocationDate( TravelModel model ) {
            Picasso.get().load(model.getImageUrl()).into(binding.knbLocation);
            binding.textTitle.setText(model.getTitle());
            binding.textLocation.setText(model.getLocation());
            binding.textStarRing.setText(String.valueOf(model.getStarRating()));
        }
    }
}
