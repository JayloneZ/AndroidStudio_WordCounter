package com.example.user.wordcounter;

/**
 * Created by user on 13/11/2017.
 */

public class WordCounter {

    public static int numberOfWords(String input) {
        String[] words = input.split(" ");
        return words.length;
    }
}
