package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class WordCounterTest {



    @Test
    public void getWordsTest(){
        String sentence = "This is a test";
        String[] words = WordCounter.getIndividualWords(sentence);
        assertEquals(words, "[This, is, a, test]");
    }






}