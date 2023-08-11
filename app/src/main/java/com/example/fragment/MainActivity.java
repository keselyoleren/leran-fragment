package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.fragment.HomeFragment;
import com.example.fragment.fragment.Profile;
import com.example.fragment.fragment.Settings;

public class MainActivity extends AppCompatActivity {

    private Button btnProfile, btnSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        fragmentTransaction.add(R.id.container, homeFragment);
        HomeFragment.class.getSimpleName();
        fragmentTransaction.commit();
//        btnProfile = findViewById(R.id.btn_profile);
//        btnSettings = findViewById(R.id.btn_settings);
//
//        btnProfile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.container, new Profile());
//                ft.commit();
//            }
//        });
//
//        btnSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.container, new Settings());
//                ft.commit();
//            }
//        });
    }
}