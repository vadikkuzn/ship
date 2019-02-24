package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ImageView ship = findViewById(R.id.ship1);
        final ImageView gun = findViewById(R.id.gun1);

        ship.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {


                    case MotionEvent.ACTION_DOWN:
                        break;

                    case MotionEvent.ACTION_MOVE:

                        gun.animate()
                                .rotation(event.getY()/25)
                                .setDuration(0)
                                .start();

                        break;


                    case MotionEvent.ACTION_UP:


                        break;


                    default:
                        return false;
                }

                return true;
            }
        });
    }
}
