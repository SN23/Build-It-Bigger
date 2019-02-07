package com.nahal.sukhjinder.jokelib;

import java.util.ArrayList;
import java.util.Random;

public class JokeTelling {

    private ArrayList<String> jokes;
    private Random randomNum;

    public JokeTelling(){
        jokes = new ArrayList<String>();
        jokes.add("Did you hear about the monkeys who shared an Amazon account? They were Prime mates.");
        jokes.add("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.");

        randomNum = new Random();
    }

    public String getJoke(){
        return jokes.get(randomNum.nextInt(3));
    }
}
