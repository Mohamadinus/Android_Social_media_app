package com.example.chatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class profileAdapter extends RecyclerView.Adapter<profileAdapter.viewHolder> {
    ArrayList<profile>list;
    Context context;

    public profileAdapter(ArrayList<profile> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.profile,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        profile pro = list.get(position);
        holder.profile.setImageResource(pro.getProfile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView profile;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
        }
    }
}
