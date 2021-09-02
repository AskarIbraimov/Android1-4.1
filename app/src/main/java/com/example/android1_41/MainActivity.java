package com.example.android1_41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.album,new AlbumFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.songs,new SongsFragment()).commit();
    }
}