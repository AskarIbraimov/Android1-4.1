package com.example.android1_41;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1_41.databinding.FragmentSongsBinding;

import java.util.ArrayList;

public class SongsFragment extends Fragment {

    private ArrayList<Song> songs = new ArrayList<>();
    private FragmentSongsBinding binding;
    private Adapter adapter;

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new Adapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSongsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addList();
        binding.songsRecycler.setAdapter(adapter);
    }

    private void addList() {
        for (int i = 1; i < 20; i++) {
            songs.add(new Song(String.valueOf(i),"Blank Space","Taylor Swift","3:22"));
        }
        adapter.setList(songs);
    }
}