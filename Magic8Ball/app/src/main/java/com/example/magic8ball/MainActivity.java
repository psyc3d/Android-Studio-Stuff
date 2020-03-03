package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button answerButton;
        TextInputEditText tb1;
        tb1 = findViewById(R.id.question_input);

        answerButton = (Button) findViewById(R.id.asnwer_button);
        final ImageView ball = (ImageView) findViewById(R.id.magicball);

        final int[] ball_array = {R.drawable.ball1,
                            R.drawable.ball2,
                            R.drawable.ball3,
                            R.drawable.ball4,
                            R.drawable.ball5};



//        Log.d("Magic 8 Ball","The number generated is :"+number);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                TextInputEditText tb1;
                tb1 = findViewById(R.id.question_input);
                String s = tb1.getText().toString();
                int k = s.length();
                if (k > 5){
                    number = 3;
                }
                else if(k > 2){
                    number = 4;
                }

                Log.d("Magic 8 Ball", "The question is "+s);
                ball.setImageResource(ball_array[number]);



            }
        });

    }
}
