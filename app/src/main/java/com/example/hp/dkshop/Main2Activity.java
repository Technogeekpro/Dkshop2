package com.example.hp.dkshop;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity  {

   //Array for Searching mobile Model number..


    String[] modle_name =

            {

            "Samsung",
            "Nokia",
            "Xiami Mi",
            "Karbonn",
            "Micromax",
            "Lava",
            "I Phone",
            "Vivo",
            "Oppo"

           };

    int[]
            modle_image =

            {

            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle,
            R.drawable.modle

            };

  Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Modle> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        int count = 0;

        for(String Name  : modle_name)
        {

            arrayList.add(new Modle(Name,modle_image[count]));
            count++;


        }
adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }

}
