package com.nunovalente.android.builditbigger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import com.nunovalente.android.jokeprovider.JokeProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityFragment fragment = new MainActivityFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.frame_fragment_main, fragment).commit();


    }

    public void openJokeActivity(View view) {
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, JokeProvider.getJoke()));
    }

    public void showJoke(View view) {

    }
}
