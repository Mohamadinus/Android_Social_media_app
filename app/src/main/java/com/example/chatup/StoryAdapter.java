package com.example.chatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.viewHolder> {
    ArrayList<models>list;
    Context context;

    public StoryAdapter(ArrayList<models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        models model = list.get(position);
        holder.imageView1.setImageResource(model.getImageView1());
        holder.profile.setImageResource(model.getProfile_image());
        holder.name.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView  imageView1,profile;
        TextView name;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.profileImage);
            profile = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.name);
        }
    }
}
