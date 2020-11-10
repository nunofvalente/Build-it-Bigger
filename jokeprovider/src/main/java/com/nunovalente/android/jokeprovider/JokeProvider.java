package com.nunovalente.android.jokeprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeProvider {

    public static String getJoke() {
        List<String> jokesList = new ArrayList<>();

        jokesList.add("What's the best thing about Switzerland? I don't know, but the flag is a big plus.");
        jokesList.add("I invented a new word: Plagiarism!");
        jokesList.add("Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them.");
        jokesList.add("Why do we tell actors to break a leg? Because every play has a cast.");
        jokesList.add("Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, What’s the word on the street?");
        jokesList.add("How many times can you subtract 10 from 100? Once. The next time you would be subtracting 10 from 90.");

        Random random = new Random();

        return jokesList.get(random.nextInt(jokesList.size()));

    }
}