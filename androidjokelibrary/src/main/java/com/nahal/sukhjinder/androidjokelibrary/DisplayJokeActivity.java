package com.nahal.sukhjinder.androidjokelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT = "joke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView jokeTV = findViewById(R.id.joke_tv);
        String joke = getIntent().getStringExtra(JOKE_INTENT);
        jokeTV.setText(joke);
    }

}
