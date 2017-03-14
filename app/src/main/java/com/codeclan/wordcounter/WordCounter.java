package com.codeclan.wordcounter;

import java.lang.reflect.Array;

import java.util.*;


public class WordCounter {
    private HashMap<String, Integer> wordcounter;


    public WordCounter(){
        wordcounter = new HashMap<String, Integer>();

    }

    public HashMap<String, Integer> getWordcounter() {
        return wordcounter;
    }

    public void setWordcounter(HashMap<String, Integer> wordcounter) {
        this.wordcounter = wordcounter;
    }

    public static ArrayList<String> getIndividualWords(String sentence){
        String[] words = sentence.split("\\W+");
        ArrayList<String> contents = new ArrayList<>();
        for ( String word : words) {
            contents.add(word);
        }
    return contents;
    }
}
