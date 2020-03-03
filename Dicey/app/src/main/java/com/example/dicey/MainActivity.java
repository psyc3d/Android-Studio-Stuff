package com.example.dicey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.left_dice);
        final ImageView rightDice = findViewById(R.id.right_dice);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicey", "The buttons been pressed");
                Random randomNumberGenerator = new Random();

                int number1 = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);

//                Log.d("Dicey", "The random number is"+ number);
            }
        });



    }
}
