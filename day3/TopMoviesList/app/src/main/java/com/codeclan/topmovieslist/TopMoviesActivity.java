package com.codeclan.topmovieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list);

        TopMovies topMovies = new TopMovies();
        ArrayList<Movie> list = topMovies.getList();

        TopMoviesAdapter moviesAdapter = new TopMoviesAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(moviesAdapter);

    }

    public void getMovie(View listItem){
        Movie movie = (Movie) listItem.getTag();
        Log.d("Movie title ", movie.getTitle());

    }

}
