package com.nunovalente.android.joker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    public static final String JOKE_PASSED = "joke_passed";

    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            mJoke = bundle.getString(JOKE_PASSED);
        }

        TextView mTextJoke = findViewById(R.id.tv_joke);
        mTextJoke.setText(mJoke);
    }
}