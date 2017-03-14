package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordStartActivity extends AppCompatActivity {

    EditText sentenceEditText;
    Button countWordsButton;
    TextView numberOfWords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_start);


        sentenceEditText = (EditText) findViewById(R.id.sentence);
        countWordsButton = (Button) findViewById(R.id.count_words_button);
        numberOfWords = (TextView) findViewById(R.id.number_of_words);
    }

    public void onCountWordsButtonClicked(View Button) {
        Intent intent = new Intent(this, WordCountActivity.class);
        String sentence = sentenceEditText.getText().toString();
        intent.putExtra("sentence", sentence);
        startActivity(intent);

    }

}

