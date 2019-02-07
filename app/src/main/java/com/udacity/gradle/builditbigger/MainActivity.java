package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.nahal.sukhjinder.androidjokelibrary.DisplayJokeActivity;
import com.nahal.sukhjinder.jokelib.JokeTelling;

public class MainActivity extends AppCompatActivity {

    private JokeTelling jokeTelling;
    public static final String JOKE_INTENT = "joke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokeTelling = new JokeTelling();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        String joke = jokeTelling.getJoke();
        Intent jokeIntent = new Intent(this, DisplayJokeActivity.class);
        jokeIntent.putExtra(JOKE_INTENT, joke);
        jokeIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(jokeIntent);
    }


}
