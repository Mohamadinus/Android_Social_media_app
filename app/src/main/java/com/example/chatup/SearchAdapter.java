package com.example.chatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    ArrayList<Search>list;
    Context context;

    public SearchAdapter(ArrayList<Search> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.searcg_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Search search = list.get(position);
        holder.image1.setImageResource(search.getImage1());
        holder.image2.setImageResource(search.getImage2());
        holder.image3.setImageResource(search.getImage3());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image1,image2,image3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            image2=itemView.findViewById(R.id.image2);
            image3=itemView.findViewById(R.id.image3);
        }
    }
}
