package com.example.chatup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class notificationFragment2 extends Fragment {
RecyclerView recyclerView;
ArrayList<notification>list;


    public notificationFragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_notification2, container, false);
       recyclerView = view.findViewById(R.id.recycle);
       list = new ArrayList<>();
       list.add(new notification(R.drawable.photo3,"<b>Mohamadinus Bagwan</b> mention you in a post","22 minutes ago"));
       list.add(new notification(R.drawable.photo,"<b>_King_007</b> mention you in a comment","22 minutes ago"));
       list.add(new notification(R.drawable.photo2,"<b>Mohamad</b> mention you in a post","22 minutes ago"));
       list.add(new notification(R.drawable.profile,"<b>bagwen_0923 </b>mention you in a comment","22 minutes ago"));
       list.add(new notification(R.drawable.photo3,"<b>King </b>mention you in a post","22 minutes ago"));
       list.add(new notification(R.drawable.photo,"<b>Joker </b>mention you in a comment","22 minutes ago"));
       list.add(new notification(R.drawable.photo2,"<b>Ironman </b> mention you in a post","22 minutes ago"));
       list.add(new notification(R.drawable.profile,"<b>Thor </b>mention you in a comment","22 minutes ago"));
       list.add(new notification(R.drawable.photo3,"<b>Hulk  </b>mention you in a post","22 minutes ago"));
       list.add(new notification(R.drawable.photo,"<b>Captain</b> mention you in a comment","22 minutes ago"));
       NotificationAdapter adapter = new NotificationAdapter(list,getContext());
       LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
       recyclerView.setLayoutManager(layoutManager);
       recyclerView.setAdapter(adapter);

       return view;
    }
}