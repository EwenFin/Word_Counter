package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    TextView numberOfWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String sentence = extras.getString("sentence");
        String count = WordCounter.counter(sentence);



         numberOfWords= (TextView)findViewById(R.id.number_of_words);


        numberOfWords.setText( "Number of instances of the words:" + count);
    }
}
