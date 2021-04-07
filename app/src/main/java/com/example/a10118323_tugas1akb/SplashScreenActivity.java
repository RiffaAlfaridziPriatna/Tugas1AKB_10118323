//07-04-2021 10118323 Riffa Alfaridzi Priatna IF8
package com.example.a10118323_tugas1akb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    private Animation alfatogo;
    private ImageView ivLogo;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        alfatogo = AnimationUtils.loadAnimation(this, R.anim.alfatogo);
        progressDialog = new ProgressDialog(SplashScreenActivity.this);
        ivLogo = findViewById(R.id.ivLogo);

        ivLogo.startAnimation(alfatogo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                finish();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.show();
                progressDialog.setContentView(R.layout.custom_loading);
                progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }, 1200);
    }
}
