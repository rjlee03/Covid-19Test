package com.example.covy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = findViewById(R.id.logo);
        Animation fade = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        logo.startAnimation(fade);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),page2.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }


        };
        timer.start();
    }
}
