package com.example.androidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String KEY_JOKE_DATA = "key_joke_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView joke_tv = findViewById(R.id.joke_tv);

        if (getIntent().hasExtra(KEY_JOKE_DATA)){
            joke_tv.setText(getIntent().getStringExtra(KEY_JOKE_DATA));
        } else {
            joke_tv.setText(R.string.no_joke_to_tell);
        }
    }
}
