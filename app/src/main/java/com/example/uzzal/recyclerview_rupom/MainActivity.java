package com.example.uzzal.recyclerview_rupom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("Shaptami","Suvash",
            "Sajal","Najmul","Muzahid vaia","RockyVaia","Mamunur Rashid vaia","MamunVaia","Sajib vaia",
            "Nurul vaia","Nabil vaia","Anowar vaia","Tamim","Mushi","Mamudullah"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this,personNames);
        recyclerView.setAdapter(adapter);
    }
}
