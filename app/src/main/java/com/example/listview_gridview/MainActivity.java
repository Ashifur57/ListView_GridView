package com.example.listview_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.listview_gridview.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    private final int duration = 5000;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image1);

        imageView.animate().alpha(1f).setDuration(5000);

    }

    public void Fruit(View view) {
        Intent intent1 = new Intent(MainActivity.this,ListActivity.class);
        startActivity(intent1);
    }

    public void BD_Player(View view) {
        Intent intent2 = new Intent(MainActivity.this, GridActivity.class);
        startActivity(intent2);
    }
}