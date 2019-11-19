package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    public ArrayList<Player> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Todo reference listview
        ListView listView = findViewById(R.id.listView);

    //Todo ListView listView = findViewById();
    //Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo add custom adapter to listview
        //Todo listView.setAdapter(------);
        ArrayAdapter<Player> MyAdapter = new ArrayAdapter<>(this, R.layout.activity_main, list);
        listView.setAdapter(MyAdapter);
    }

    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public void getPlayers() {
        String[] name = new String[] {};
        int[] age = new int[] {};
        int[] worth = new int[] {};
        String[] MainSport = new String[] {};
        int[] imageResource = new int[] {};
        String[] webpage = new String[] {};

        for (int i=0; i<15; i++) {
            list.add(new Player(name[i], age[i], worth[i], MainSport[i], imageResource[i], webpage[i]));
        }

    }
}
