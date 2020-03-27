package com.example.recycleview_project_iva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("It Chapter Two", "horror", (long) 2019));
        movies.add(new Movie("Pet Sematary", "horror", (long) 2019));
        movies.add(new Movie("Doctor Sleep", "horror", (long) 2019));
        movies.add(new Movie("The Gift", "thriller", (long) 2015));
        movies.add(new Movie("Gone Girl", "thriller", (long) 2014));
        movies.add(new Movie("Shutter Island", "thriller", (long) 2010));
        movies.add(new Movie("Step Brothers", "comedy", (long) 2008));
        movies.add(new Movie("Scary Movie", "comedy", (long) 2000));
        movies.add(new Movie("Dumb and Dumber", "comedy", (long) 1994));



        CustomAdapter adapter = new CustomAdapter(movies);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
