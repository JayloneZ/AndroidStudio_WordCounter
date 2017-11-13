package com.example.user.wordcounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 13/11/2017.
 */

public class WordCounterTest {

    @Test
    public void testWordCounterStartsAtOne() {
        assertEquals(1, WordCounter.numberOfWords("Hello"));
    }

    @Test
    public void testWordCounter() {
        assertEquals(4, WordCounter.numberOfWords("Hello, my name is"));
    }
}
