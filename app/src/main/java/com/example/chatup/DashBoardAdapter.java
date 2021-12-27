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

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.viewHolder> {
ArrayList<DashBoard>boardArrayList;
Context context;

    public DashBoardAdapter(ArrayList<DashBoard> boardArrayList, Context context) {
        this.boardArrayList = boardArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        DashBoard dashBoard = boardArrayList.get(position);
        holder.profileimage.setImageResource(dashBoard.getProfile_image());
        holder.bigImage.setImageResource(dashBoard.getBigImage());
        holder.bookmark.setImageResource(dashBoard.getBookmark());
        holder.name.setText(dashBoard.getName1());
        holder.name2.setText(dashBoard.getName2());
        holder.heart.setText(dashBoard.getHeart());
        holder.comment.setText(dashBoard.getComment());
        holder.share.setText(dashBoard.getShare());
    }

    @Override
    public int getItemCount() {
        return boardArrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView profileimage,bigImage,bookmark;
        TextView name ,name2,heart,comment,share;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profileimage = itemView.findViewById(R.id.profile);
            bigImage = itemView.findViewById(R.id.profileImage);
            bookmark = itemView.findViewById(R.id.bookmark);
            name = itemView.findViewById(R.id.name1);
            name2 = itemView.findViewById(R.id.name2);
            heart = itemView.findViewById(R.id.heart);
            comment = itemView.findViewById(R.id.comment);
            share = itemView.findViewById(R.id.share);
        }
    }
}
