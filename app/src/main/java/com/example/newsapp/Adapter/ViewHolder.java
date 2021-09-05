package com.example.newsapp.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {

     TextView mheading,mcontent,mauthor,mtime;
     CardView cardView;
     ImageView imageView;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mheading = itemView.findViewById(R.id.mainheading);
        mcontent = itemView.findViewById(R.id.content);
        mauthor = itemView.findViewById(R.id.author);
        mtime = itemView.findViewById(R.id.time);
        cardView = itemView.findViewById(R.id.cardview);
        imageView = itemView.findViewById(R.id.imageview);

    }


}
