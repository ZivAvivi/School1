package com.example.rockpaperscissors;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        TextView tvRules = findViewById(R.id.tvRules);
        tvRules.setText(readRules());
    }

    private String readRules() {
        StringBuilder rules = new StringBuilder();
        InputStream inputStream = getResources().openRawResource(R.raw.text);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                rules.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rules.toString();
    }
}
