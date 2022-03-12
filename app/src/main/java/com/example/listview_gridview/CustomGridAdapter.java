package com.example.listview_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomGridAdapter extends BaseAdapter {
    Context context;
    List<Cricketer> cricketerList = new ArrayList<>();

    public CustomGridAdapter(Context context, List<Cricketer> cricketerList) {
        this.context = context;
        this.cricketerList = cricketerList;
    }

    @Override
    public int getCount() {
        return cricketerList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customVeiw = inflater.inflate(R.layout.item_layout, null);
        ImageView imageView = customVeiw.findViewById(R.id.imageView);
        TextView textView = customVeiw.findViewById(R.id.textView);

        imageView.setImageResource(cricketerList.get(position).getImage());
        textView.setText(cricketerList.get(position).getName());

        return customVeiw;
    }
}
