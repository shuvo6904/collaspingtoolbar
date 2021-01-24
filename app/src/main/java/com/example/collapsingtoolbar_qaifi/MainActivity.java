package com.example.collapsingtoolbar_qaifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.collaspingToolbarId);
        toolbarLayout.setTitle("Collasping Toolbar");
        toolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.purple_200));
        toolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));

    }
}