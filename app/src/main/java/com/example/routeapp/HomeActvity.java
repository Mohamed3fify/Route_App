package com.example.routeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.routeapp.databinding.ActivityHomeBinding;

public class HomeActvity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        intent.putExtra(Constance.COURSES, "courses");
        binding.androidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES, Constance.ANDROID_DETAILS);
                intent.putExtra(Constance.COURSES, R.drawable.android);
                startActivity(intent);
            }
        });

        binding.androidImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES, Constance.ANDROID_DETAILS);
                intent.putExtra(Constance.COURSES, R.drawable.android);
                startActivity(intent);
            }
        });

        binding.iosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES, Constance.IOS_DETAILS);
                startActivity(intent);
            }
        });

        binding.iosImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES,Constance.IOS_DETAILS);
                startActivity(intent);
            }
        });

        binding.fullStackImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES, Constance.FULLSTACK_DETAILS);
                startActivity(intent);
            }
        });

        binding.fullStackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActvity.this, CoursesDetails.class);
                intent.putExtra(Constance.COURSES, Constance.FULLSTACK_DETAILS);
                startActivity(intent);
            }
        });

    }

}