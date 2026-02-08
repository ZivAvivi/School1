package com.example.rockpaperscissors;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvScore;
    private TextView welcome;
    private ImageButton ibRock, ibPaper, ibScissors;
    private int wins = 0;
    private int losses = 0;
    private int selectedUserChoice = 0; // 0: None, 1: Rock, 2: Paper, 3: Scissors



    private ActivityResultLauncher<Intent> resultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // changes the title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("RPS");
        }

        tvScore = findViewById(R.id.tvScore);
        welcome = findViewById(R.id.welcome);

        SharedPreferences sp = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String userName = sp.getString("userName", "");
        welcome.setText("Welcome " + userName);
        
        ibRock = findViewById(R.id.ibRock);
        ibPaper = findViewById(R.id.ibPaper);
        ibScissors = findViewById(R.id.ibScissors);
        
        Button btnConfirm = findViewById(R.id.btnConfirm);

        updateScoreDisplay();

        ibRock.setOnClickListener(v -> selectChoice(1));
        ibPaper.setOnClickListener(v -> selectChoice(2));
        ibScissors.setOnClickListener(v -> selectChoice(3));

        btnConfirm.setOnClickListener(v -> {
            if (selectedUserChoice != 0) {
                playGame(selectedUserChoice);
            } else {
                Toast.makeText(MainActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
            }
        });

        resultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        if (data != null && data.getBooleanExtra("reset", false)) {
                           // Reset logic if needed, currently not requested but good to have
                        }
                        // Reset selection when returning
                         selectChoice(0);
                    }
                }
        );
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        if (menu instanceof MenuBuilder) {
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_toast) {
            Toast.makeText(this, "Rock Paper Scissors!", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_user_manual) {
            Intent intent = new Intent(this, RulesActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void selectChoice(int choice) {
        selectedUserChoice = choice;
        // Reset backgrounds
        ibRock.setBackgroundColor(Color.TRANSPARENT);
        ibPaper.setBackgroundColor(Color.TRANSPARENT);
        ibScissors.setBackgroundColor(Color.TRANSPARENT);

        // Highlight selected
        if (choice == 1) ibRock.setBackgroundColor(Color.LTGRAY);
        else if (choice == 2) ibPaper.setBackgroundColor(Color.LTGRAY);
        else if (choice == 3) ibScissors.setBackgroundColor(Color.LTGRAY);
    }

    private void playGame(int userChoice) {
        // 1 is rock, 2 is paper, 3 is scissors
        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1; // 1 to 3

        String message;
        if (userChoice == computerChoice) {
            message = "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            message = "You Win!";
            wins++;
        } else {
            message = "You Lose!";
            losses++;
        }

        updateScoreDisplay();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("userChoice", userChoice);
        intent.putExtra("computerChoice", computerChoice);
        intent.putExtra("wins", wins);
        intent.putExtra("losses", losses);
        intent.putExtra("result", message);
        
        resultLauncher.launch(intent);
    }

    private void updateScoreDisplay() {
        String winsText = String.valueOf(wins);
        String separator = " : ";
        String lossesText = String.valueOf(losses);
        String fullText = winsText + separator + lossesText;

        SpannableString spannable = new SpannableString(fullText);

        // Color wins green
        spannable.setSpan(new ForegroundColorSpan(Color.GREEN), 0, winsText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Color losses red
        int lossesStart = winsText.length() + separator.length();
        spannable.setSpan(new ForegroundColorSpan(Color.RED), lossesStart, fullText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        tvScore.setText(spannable);
    }
}
