package com.example.listview_gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    GridView cricketerGridView;
    com.example.listview_gridview.CustomGridAdapter adapter;

    List<Cricketer> cricketerList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        cricketerGridView = findViewById(R.id.grid);
        cricketerList = new ArrayList<>();


        setCricketerData();
        adapter = new com.example.listview_gridview.CustomGridAdapter(this,cricketerList);
        cricketerGridView.setAdapter(adapter);

    }

    private void setCricketerData() {
        Cricketer tamim = new Cricketer(R.drawable.tamim, "Tamim Iqbal(C)");
        Cricketer sakib = new Cricketer(R.drawable.sakib, "Shakib Al Hasan");
        Cricketer musfiq = new Cricketer(R.drawable.musfiq, "Mushfiqur Rahim");
        Cricketer riyad = new Cricketer(R.drawable.reyad, "Mahmudullah Riyad");
        Cricketer liton = new Cricketer(R.drawable.liton, "Liton Das");
        Cricketer mehadi = new Cricketer(R.drawable.mehadi, "Mehedi Hasan");
        Cricketer afif = new Cricketer(R.drawable.afif, "Afif Hossain");
        Cricketer taskin = new Cricketer(R.drawable.taskin, "Taskin Ahmed");
        Cricketer mutafiz = new Cricketer(R.drawable.mustafiz, "Mustafizur Rahman");
        Cricketer shoriful = new Cricketer(R.drawable.soriful, "Shoriful Islam");
        Cricketer Sommo = new Cricketer(R.drawable.sommo, "Soumya Sarkar");
        Cricketer nasum = new Cricketer(R.drawable.nasum, "Nasum Ahmed");
        Cricketer santo = new Cricketer(R.drawable.santo, "Najmul Hossain Shanto");
        Cricketer mahadi = new Cricketer(R.drawable.mahedi, "Sheikh Mehedi Hasan");
        Cricketer rubel = new Cricketer(R.drawable.rubel, "Rubel Hossain");
        Cricketer ebadot = new Cricketer(R.drawable.ebadot, "Ebadat Hossain");


        cricketerList.add(tamim);
        cricketerList.add(sakib);
        cricketerList.add(musfiq);
        cricketerList.add(riyad);
        cricketerList.add(liton);
        cricketerList.add(mehadi);
        cricketerList.add(afif);
        cricketerList.add(taskin);
        cricketerList.add(mutafiz);
        cricketerList.add(shoriful);
        cricketerList.add(Sommo);
        cricketerList.add(nasum);
        cricketerList.add(santo);
        cricketerList.add(mahadi);
        cricketerList.add(rubel);
        cricketerList.add(ebadot);


    }
}