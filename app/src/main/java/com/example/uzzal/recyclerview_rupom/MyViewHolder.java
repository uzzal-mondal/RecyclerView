package com.example.uzzal.recyclerview_rupom;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {


    TextView nameText;
    public MyViewHolder(View itemView) {
        super(itemView);

        nameText = (TextView) itemView.findViewById(R.id.textView_id);
    }
}
