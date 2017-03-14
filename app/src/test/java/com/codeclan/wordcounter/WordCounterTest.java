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
        HashMap<String, Integer> words = WordCounter.getIndividualWords(sentence);
        assertEquals(words.toString(), "{a=1, test=1, This=1, is=1}");
    }

    @Test
    public void countWordsTest(){
        String sentence = "testing, testing, one two three";

    }






}