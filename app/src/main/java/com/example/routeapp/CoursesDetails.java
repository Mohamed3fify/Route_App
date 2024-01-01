package com.example.routeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.routeapp.databinding.ActivityCoursesDetailsBinding;

import java.util.Objects;

public class CoursesDetails extends AppCompatActivity implements Constance{
    ActivityCoursesDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCoursesDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();

        if (intent == null || intent.getStringExtra(Constance.COURSES) == null || !intent.hasExtra(Constance.COURSES))
           return;

       String courseName = intent.getStringExtra(Constance.COURSES);
        intent.putExtra(Constance.COURSES, "courses");
        if (courseName == null) {
            return;
        }

        switch (courseName) {
            case Constance.ANDROID_DETAILS: {
                intent.putExtra(Constance.ANDROID_COURSE, "android");
                binding.courseDetails.setText(Constance.ANDROID_DETAILS);
                binding.courseImage.setImageResource(R.drawable.android);
                break;
            }
            case Constance.IOS_DETAILS: {
                intent.putExtra(Constance.IOS_COURSE, "ios");
                binding.courseDetails.setText(Constance.IOS_DETAILS);
                binding.courseImage.setImageResource(R.drawable.ios);
                break;
            }
            case Constance.FULLSTACK_DETAILS: {
                intent.putExtra(Constance.FULLSTACK_COURSE, "fullstack");
                binding.courseDetails.setText(Constance.FULLSTACK_DETAILS);
                binding.courseImage.setImageResource(R.drawable.fullstack);
                break;
            }
            default:
                break;
        }

    }
}