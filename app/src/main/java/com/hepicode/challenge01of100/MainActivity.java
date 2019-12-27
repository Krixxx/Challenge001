package com.hepicode.challenge01of100;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textNumber;
    Button button;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumber = findViewById(R.id.textview);
        button = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            random = bundle.getInt("number");
        }else {
            random = new Random().nextInt(100) + 1;
        }

        textNumber.setText(String.valueOf(random));
    }

    public void btnPressed(View view){

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("number", random);
        startActivity(intent);

    }

    /*
    1. On app launch, Activity A page will appear on the screen with a random generated number
    2. The Activity A and B will contain a Button and TextView widgets
    3. The TextView widget will display a random number
    4. The Button widget is wired with an onClick event.
    5. When Activity A button is clicked, it will navigate to Activity B and display the generated random number on Activity B TextView widget.
    6. When the Button widget on Activity B is clicked, it will generate a new random numbers and display it on the TextView on Activity A
    7. The Activity A button text is “Activity A Button“ while Activity B is “Activity B Button“.
     */
}
