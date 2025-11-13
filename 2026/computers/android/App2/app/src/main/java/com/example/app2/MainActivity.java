package com.example.app2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spActions;
    String[] actions = {"?", "<", ">", "="};
    RadioButton rbBig, rbSmall, rbEqual;
    TextView sign, number1, number2, helloMessage;
    Button bBig, bEqual, bSmall, check;


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

        // add spinner options
        spActions = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, actions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spActions.setAdapter(adapter);

        // on click listener for spinner
        spActions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i != 0)
                    sign.setText(" "+ actions[i] + " ");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        helloMessage = findViewById(R.id.helloMessage);
        helloMessage.setText(" Hello, " + getIntent().getStringExtra("name") + " ");

        sign = findViewById(R.id.sign);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        Random rnd = new Random();
        number1.setText(" " + rnd.nextInt(10) + " ");
        number2.setText(" " + rnd.nextInt(10) + " ");

        rbBig = findViewById(R.id.rbBig);
        rbEqual = findViewById(R.id.rbEqual);
        rbSmall = findViewById(R.id.rbSmall);
        rbBig.setOnClickListener(this);
        rbEqual.setOnClickListener(this);
        rbSmall.setOnClickListener(this);

        bBig = findViewById(R.id.bBig);
        bEqual = findViewById(R.id.bEqual);
        bSmall = findViewById(R.id.bSmall);
        bBig.setOnClickListener(this);
        bEqual.setOnClickListener(this);
        bSmall.setOnClickListener(this);

        check = findViewById(R.id.check);
        check.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view == rbBig) {
            sign.setText(" > ");
        } else if (view == rbEqual) {
            sign.setText(" = ");
        } else if (view == rbSmall) {
            sign.setText(" < ");
        } else if (view == bBig) {
            sign.setText(" > ");
        } else if (view == bEqual) {
            sign.setText(" = ");
        } else if (view == bSmall) {
            sign.setText(" < ");
        } else if (view == check) {
            String signStr = sign.getText().toString().trim();
            int num1 = Integer.parseInt(number1.getText().toString().trim());
            int num2 = Integer.parseInt(number2.getText().toString().trim());

            if (signStr.equals(">")) {
                if (num1 > num2)
                    Toast.makeText(this, "correct", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "wrong", Toast.LENGTH_LONG).show();
            } else if (signStr.equals("=")) {
                if (num1 == num2)
                    Toast.makeText(this, "correct", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "wrong", Toast.LENGTH_LONG).show();
            } else if (signStr.equals("<")) {
                if (num1 < num2)
                    Toast.makeText(this, "correct", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "wrong", Toast.LENGTH_LONG).show();
            }
        }
    }
}
