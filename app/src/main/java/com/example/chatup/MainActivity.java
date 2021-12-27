package com.example.chatup;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.chatup.databinding.ActivityMainBinding;
import com.example.chatup.model.AddFragment;
import com.example.chatup.model.HomeFragment;
import com.example.chatup.model.NotificationFragment;
import com.example.chatup.model.ProfileFragment;
import com.example.chatup.model.SearchFragment;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.containerView, new HomeFragment());
        transaction.commit();

        binding.readableBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i){
                    case 0:
                        transaction.replace(R.id.containerView, new HomeFragment());
                        break;
                    case 1:
                        transaction.replace(R.id.containerView, new SearchFragment());
                        break;
                    case 2:
                        transaction.replace(R.id.containerView, new AddFragment());
                        break;
                    case 3:
                        transaction.replace(R.id.containerView, new NotificationFragment());
                        break;
                    case 4:
                        transaction.replace(R.id.containerView, new ProfileFragment());
                        break;
                }
                transaction.commit();
            }
        });
    }
}