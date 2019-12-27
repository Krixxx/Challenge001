package com.hepicode.challenge01of100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView textNumber;
    Button button;
    int number, random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textNumber = findViewById(R.id.textview_two);
        button = findViewById(R.id.button_two);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            number = bundle.getInt("number");
        }

        textNumber.setText(String.valueOf(number));
    }

    public void btnPressedTwo(View view){
        random = new Random().nextInt(100) + 1;

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("number", random);
        startActivity(intent);
    }
}
