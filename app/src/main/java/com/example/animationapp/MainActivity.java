package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator mAnimator;
    ObjectAnimator mAnimator2;
    ObjectAnimator trainAnimator;
    ObjectAnimator crossAnimator;
    ObjectAnimator crossAnimator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgView = findViewById(R.id.img);
        ImageView TrainView = findViewById(R.id.train);
        ImageView CrossView = findViewById(R.id.cross);
        Button btn = findViewById(R.id.start_btn);

        mAnimator = ObjectAnimator.ofFloat(imgView, "y", 750); //property name: x, y, rotation
        mAnimator2 = ObjectAnimator.ofFloat(imgView, "y", 0);

        trainAnimator = ObjectAnimator.ofFloat(TrainView, "x", 800);

        crossAnimator = ObjectAnimator.ofFloat(CrossView, "x", 450);
        crossAnimator2 = ObjectAnimator.ofFloat(CrossView, "x", 300);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimator.setDuration(1000);
                mAnimator.start();
                crossAnimator.setStartDelay(1000);
                crossAnimator.start();
                trainAnimator.setDuration(1000);
                trainAnimator.setStartDelay(2000);
                trainAnimator.start();
                crossAnimator2.setStartDelay(3000);
                crossAnimator2.start();
                mAnimator2.setDuration(1000);
                mAnimator2.setStartDelay(4000);
                mAnimator2.start();
            }
        });


    }
}