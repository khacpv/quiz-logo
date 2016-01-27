package com.oic.game.quizlogo.screens.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.oic.game.quizlogo.BaseActivity;
import com.oic.game.quizlogo.R;
import com.oic.game.quizlogo.screens.home.HomeActivity;

/**
 * Created by khacpham on 1/27/16.
 */
public class SplashActivity extends BaseActivity {

    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
            }
        },1000);
    }
}
