package com.example.listview_gridview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAddapter extends ArrayAdapter<String> {
    private Activity context;
    private  String[] fruits;
    private  Integer[] image;
    public CustomAddapter(Activity context, String[] fruits, Integer[] image) {
        super(context, R.layout.mycustomlist,fruits);
        this.context = context;
        this.fruits = fruits;
        this.image = image;
    }

    public View getView(int postion, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowVeiw = inflater.inflate(R.layout.mycustomlist, null, true);
        TextView fruitTV = rowVeiw.findViewById(R.id.name);
        ImageView imageTV = rowVeiw.findViewById(R.id.image);

        fruitTV.setText(fruits[postion]);
        imageTV.setImageResource(image[postion]);

        return rowVeiw;
    }



}
