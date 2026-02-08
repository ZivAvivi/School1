package com.example.rockpaperscissors;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class logIn extends AppCompatActivity {

    private EditText email;
    private EditText userName;
    private EditText password;

    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // changes the title
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("RPS");
        }

        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword);
        userName = findViewById(R.id.editTextUserName);
        confirm = findViewById(R.id.button);

        confirm.setOnClickListener(v -> {
            String emailText = email.getText().toString();
            String passwordText = password.getText().toString();
            String userNameText = userName.getText().toString();
            if (emailText.isEmpty() || passwordText.isEmpty() || userNameText.isEmpty()) {
                Toast.makeText(logIn.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!emailText.endsWith("@gmail.com")) {
                Toast.makeText(logIn.this, "Invalid email", Toast.LENGTH_SHORT).show();
                return;
            }

            SharedPreferences.Editor editor = getSharedPreferences("MyPrefs", MODE_PRIVATE).edit();
            editor.putString("email", emailText);
            editor.putString("password", passwordText);
            editor.putString("userName", userNameText);
            editor.apply();

            Toast.makeText(logIn.this, "Login successful!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(logIn.this, MainActivity.class);
            startActivity(intent);
        });


    }
}