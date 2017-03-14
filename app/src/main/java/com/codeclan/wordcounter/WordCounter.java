package com.codeclan.wordcounter;

import java.util.*;


public class WordCounter {


    public static String Counter(String sentence){
        String[] words = sentence.toLowerCase().split("\\W+");
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();

        for(String word : words){
            Integer count = occurences.get(word);
            if (count == null){
                count = 0;
            }
            occurences.put(word, count +1);
        }
        return occurences.toString();
    }
}
