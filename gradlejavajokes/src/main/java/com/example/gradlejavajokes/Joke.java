package com.example.gradlejavajokes;

import java.util.Random;

public class Joke {

    public static String getJoke() {
        String[] jokesArray = new String[5];
        jokesArray[0] = " How many programmers does it take to change a light bulb?\n" +
                "\n" +
                "None, that's a hardware problem.";
        jokesArray[1] = "Why are frogs always so happy?\n\n They eat what ever bugs them.";
        jokesArray[2] = " I love pressing F5.\n\nIt's so refreshing.";
        jokesArray[3] = "There are only 10 types of people in the world: \nthose who understand binary, \nand those who don't.";
        jokesArray[4] = "Why do Python Devs need glasses?\n\n Because they don't C#.";

        return jokesArray[new Random().nextInt(jokesArray.length)];
    }
}
