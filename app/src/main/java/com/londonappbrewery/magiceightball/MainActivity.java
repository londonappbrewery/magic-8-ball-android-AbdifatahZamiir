package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
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
        Button myButton;
        myButton = findViewById(R.id.askButton);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic-8-ball", "the bottom is prassed");
                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(ballArray.length);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });

    }
}
