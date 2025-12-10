package com.example.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int userChoice = getIntent().getIntExtra("userChoice", 0);
        int computerChoice = getIntent().getIntExtra("computerChoice", 0);
        int wins = getIntent().getIntExtra("wins", 0);
        int losses = getIntent().getIntExtra("losses", 0);
        String result = getIntent().getStringExtra("result");

        TextView tvResult = findViewById(R.id.tvResult);
        ImageView ivUserChoice = findViewById(R.id.ivUserChoice);
        ImageView ivComputerChoice = findViewById(R.id.ivComputerChoice);
        TextView tvResultScore = findViewById(R.id.tvResultScore);
        Button btnPlayAgain = findViewById(R.id.btnPlayAgain);

        tvResult.setText(result);
        
        ivUserChoice.setImageResource(getImageResource(userChoice));
        ivComputerChoice.setImageResource(getImageResource(computerChoice));

        String winsText = String.valueOf(wins);
        String separator = " : ";
        String lossesText = String.valueOf(losses);
        String fullText = winsText + separator + lossesText;

        SpannableString spannable = new SpannableString(fullText);
        spannable.setSpan(new ForegroundColorSpan(Color.GREEN), 0, winsText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        int lossesStart = winsText.length() + separator.length();
        spannable.setSpan(new ForegroundColorSpan(Color.RED), lossesStart, fullText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        
        tvResultScore.setText(spannable);

        btnPlayAgain.setOnClickListener(v -> {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("reset", false); 
            setResult(Activity.RESULT_OK, returnIntent);
            finish();
        });
    }

    private int getImageResource(int choice) {
        switch (choice) {
            case 1: return R.drawable.rock;
            case 2: return R.drawable.paper;
            case 3: return R.drawable.scissors;
            default: return 0;
        }
    }
}
