package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {
    public ArticleAdapter(Context context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Article article = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.index, parent, false);
        }
        // Lookup view for data population
        TextView Code = (TextView) convertView.findViewById(R.id.Code1);
        TextView Libelle = (TextView) convertView.findViewById(R.id.Libelle1);
        TextView Pv = (TextView) convertView.findViewById(R.id.Pv1);
        // Populate the data into the template view using the data object
        Code.setText(Article.Code);
        Libelle.setText(Article.Libelle);
        Pv.setText(Article.Pv);
        // Return the completed view to render on screen
        return convertView;
    }
}