package com.example.android1_41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_41.databinding.ItemElementBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ItemElementBinding binding;
    private ArrayList<Song> list = new ArrayList<>();

    public void setList(ArrayList<Song> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemElementBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull ItemElementBinding itemView) {
            super(itemView.getRoot());

        }

        public void onBind(Song song) {
            binding.position.setText(song.getPos());
            binding.singer.setText(song.getSinger());
            binding.songTitle.setText(song.getTitle());
            binding.duration.setText(song.getDuration());
        }
    }
}
