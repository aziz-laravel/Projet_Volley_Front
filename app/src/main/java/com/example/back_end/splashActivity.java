package com.example.back_end;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.imageView2);
        Animation floatAnimation = AnimationUtils.loadAnimation(this, R.anim.flooat);
        imageView.startAnimation(floatAnimation);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(splashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}
