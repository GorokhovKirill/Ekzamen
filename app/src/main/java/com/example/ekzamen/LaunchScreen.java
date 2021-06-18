package com.example.ekzamen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LaunchScreen extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState);
        setContentView(R.layout.launchscreen);
        new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
            Intent i = new Intent(LaunchScreen.this, SignIn.class);
            startActivity(i);
            finish();
        }
}, 3000);


    }
}
