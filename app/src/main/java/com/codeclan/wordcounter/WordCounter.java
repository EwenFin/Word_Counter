package com.codeclan.wordcounter;

import java.lang.reflect.Array;

import java.util.*;


public class WordCounter {
}

    public static HashMap<String, Integer> WordCounter(String sentence){
        String[] words = sentence.split("\\W+");
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();

        for(String word : words){
            Integer count = occurences.get(word);
            if (count == null){
                count = 0;
            }
            occurences.put(word, count +1);
        }
        return occurences;
    }
}
