package com.example.fitdontquit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class StartMountainClimbing extends AppCompatActivity {
    ImageView imgTimer;
    TextView timerValue;
    View view;
    ImageView imgDisplay;
    TextView details, name;
    private static final long START_TIME_IN_MILLIS = 50000;
    public CountDownTimer countDownTimer;
   public boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    Animation alpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_workout);
        getSupportActionBar().hide();
        view=findViewById(R.id.bgprogress);
        imgTimer = (ImageView) findViewById(R.id.imgtimer);
        timerValue = (TextView) findViewById(R.id.timerValue);
        alpha = AnimationUtils.loadAnimation(this, R.anim.alphago);
        timerValue.startAnimation(alpha);
        imgTimer.startAnimation(alpha);
        startTimer();
        name=findViewById(R.id.fitonetitle);
        String fName = getIntent().getStringExtra("Name");
        name.setText(fName);
        details=findViewById(R.id.subintropage);
        imgDisplay=findViewById(R.id.imgEx);
        String detail=getIntent().getStringExtra("Details");
        details.setText(detail);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            imgDisplay.setImageResource(resId);
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WorkoutsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void startTimer(){
        countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(),"Done!", Toast.LENGTH_SHORT).show();
            }
        }.start();
        mTimerRunning = true;
    }

    private void updateCountDownText()
    {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeft = String.format(Locale.getDefault(),"%02d:%02d", minutes, seconds) ;
        timerValue.setText(timeLeft);
    }
}