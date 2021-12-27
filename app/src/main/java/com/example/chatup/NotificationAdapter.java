package com.example.chatup;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.viewHolder> {
    ArrayList<notification>list;
    Context context;

    public NotificationAdapter(ArrayList<notification> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_item,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        notification notification = list.get(position);
        holder.profile.setImageResource(notification.getProfile());
        holder.name.setText(Html.fromHtml(notification.getName()));
        holder.name2.setText(notification.getName2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView name , name2;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile);
            name = itemView.findViewById(R.id.textView14);
            name2 = itemView.findViewById(R.id.textView15);
        }
    }
}
