package com.example.fitdontquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity
{
    TextView textView;
    ImageView imageView;
    Animation up,down;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        imageView=findViewById(R.id.imSplash);
        textView=findViewById(R.id.txtNameSplash);
        up= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        down= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        imageView.setAnimation(up);
        textView.setAnimation(down);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },3500);
    }
}