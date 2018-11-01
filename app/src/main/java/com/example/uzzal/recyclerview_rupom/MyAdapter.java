package com.example.uzzal.recyclerview_rupom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    ArrayList<String> personNames;
    Context context;

    public MyAdapter(Context context, ArrayList<String> personNames) {

        this.context = context;
        this.personNames = personNames;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

       holder.nameText.setText(personNames.get(position));

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(context,personNames.get(position),Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }
}
