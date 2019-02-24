package com.example.project;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView water = findViewById(R.id.water);
        ImageView ship = findViewById(R.id.ship);
        ImageView ship2 = findViewById(R.id.whiteship);
        ImageView play = findViewById(R.id.playBotton);


        TranslateAnimation previewater = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.2f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.7f);

        previewater.setDuration(1000);
        previewater.setFillAfter(true);
        water.startAnimation(previewater);


        TranslateAnimation previewship1 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, -0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.1f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.1f);
        previewship1.setDuration(7000);
        previewship1.setFillAfter(true);
        ship.startAnimation(previewship1);

        TranslateAnimation previewship2 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 1.17f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.6f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.3f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.3f);
        previewship2.setDuration(7000);
        previewship2.setFillAfter(true);
        ship2.startAnimation(previewship2);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PlayActivity.class);
                startActivity(intent);
            }
        });

    }
}
