package com.example.kenburnsview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.kenburnsview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private TravelAdapter adapter;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        bindView();

    }

    private void bindView() {
        ArrayList<TravelModel> models = new ArrayList<>();
        models.add(new TravelModel("paris", "French", new Constants().PARIS_URL, 4.20f));
        models.add(new TravelModel("Amazon", "Brazil", new Constants().BRAZIL_URL, 2.12f));
        models.add(new TravelModel("pizza tower", "italy", new Constants().PIZZA_URL, 2.45f));
        adapter = new TravelAdapter(models);
        binding.viewpager.setAdapter(adapter);


    }
}