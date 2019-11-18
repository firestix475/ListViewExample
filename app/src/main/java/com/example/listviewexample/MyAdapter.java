package com.example.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Player> {
    List<Player> listOfPlayers;
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        listOfPlayers = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View single_item_view = convertView;
        //Using this inflated view, we can get the access to the various UI widgets present in the row item XML file.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (single_item_view == null)
            single_item_view = inflater.inflate(R.layout.single_item, null);
            TextView name = single_item_view.findViewById(R.id.name);
            TextView age = single_item_view.findViewById(R.id.age);
            TextView worth = single_item_view.findViewById(R.id.worth);
            TextView mainSport = single_item_view.findViewById(R.id.mainSport);
            ImageView picture = single_item_view.findViewById(R.id.picture);

            name.setText("Name: " + listOfPlayers.get(position).getName());
            age.setText("Age: " + listOfPlayers.get(position).getAge());
            worth.setText("Worth: " + listOfPlayers.get(position).getWorth());
            mainSport.setText("Main Sport: " + listOfPlayers.get(position).getMainSport());
            picture.setImageResource(listOfPlayers.get(position).getImageResource());

            single_item_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    
                }
            });

        //Todo get single player using position and listOfPlayers
        // get references to views in single_item.xml , for example
        //        TextView name = single_item_view.findViewById(R.id.name);
        return single_item_view;
    }
}
