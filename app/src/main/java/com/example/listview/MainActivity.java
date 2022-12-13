package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Construct the data source

// Create the adapter to convert the array to views
        // ArticleAdapter adapter = new ArticleAdapter(this, articles);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listView);

        Article tom = new Article(1, "eau", 3);
        Article jerry = new Article(2, "pain", 9);
        Article donald = new Article(3, "lait", 24);
        Article lofi = new Article(4, "the", 8);


        Article[] articles = new Article[]{tom, jerry, donald, lofi};

        ArrayAdapter<Article> arrayAdapter
                = new ArrayAdapter<Article>(this, android.R.layout.simple_list_item_1, articles);

        listView.setAdapter(arrayAdapter);
    }

}