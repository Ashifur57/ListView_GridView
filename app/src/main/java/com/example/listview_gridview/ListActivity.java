package com.example.listview_gridview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {


    ListView listView;

    String[] fruits = {"Mango","Banana","Jackfruit","Apple", "Orange","Pineapple", "Coconut","Watermelon","Strawberry","Cherry","Grape","Blueberry","Raspberry","Kiwi","Lemon","Grapefruit","Mandarin"};
    Integer[] image = {R.drawable.mango,R.drawable.banana,R.drawable.jackfruit,R.drawable.apple,R.drawable.organge,R.drawable.pineapples,R.drawable.coconuts
            , R.drawable.watermelonpng,R.drawable.strawberries,R.drawable.cherries,R.drawable.grape,R.drawable.blue,R.drawable.raspberries,R.drawable.kiwi,R.drawable.lemon,
            R.drawable.grapefruit, R.drawable.mandarins};

    CustomAddapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);
        //listView.setAdapter(adapter);

        adapter = new CustomAddapter(this,fruits,image);
        listView.setAdapter(adapter);
    }



}