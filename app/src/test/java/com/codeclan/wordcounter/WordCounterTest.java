package com.codeclan.wordcounter;

import org.junit.Test;



import static org.junit.Assert.*;

public class WordCounterTest {



    @Test
    public void getWordsTest(){
        String sentence = "This is a test";
        String words = WordCounter.Counter(sentence);
        assertEquals(words, "{a=1, test=1, this=1, is=1}");
    }

    @Test
    public void getWordsTest2() {
        String sentence2 = "It was the best of times, it was the worst of times";
        String words = WordCounter.Counter(sentence2);
        assertEquals(words, "{the=2, times=2, of=2, was=2, best=1, worst=1, it=2}");
    }








}