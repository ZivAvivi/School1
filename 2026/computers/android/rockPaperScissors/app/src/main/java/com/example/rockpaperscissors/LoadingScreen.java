package com.example.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoadingScreen extends AppCompatActivity {

    CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loading_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // changes the title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("RPS");
        }

         cdt = new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
            Intent go = new Intent(LoadingScreen.this, logIn.class);
            startActivity(go);
            }
        }.start();
    }


}
