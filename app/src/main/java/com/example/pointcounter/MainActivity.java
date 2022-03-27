package com.example.pointcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import com.example.pointcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    PointViewModel myViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myViewModel = new ViewModelProvider(this).get(PointViewModel.class);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);
    }
}