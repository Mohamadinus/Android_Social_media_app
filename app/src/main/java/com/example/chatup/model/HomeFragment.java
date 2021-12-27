package com.example.chatup.model;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatup.DashBoard;
import com.example.chatup.DashBoardAdapter;
import com.example.chatup.R;
import com.example.chatup.StoryAdapter;
import com.example.chatup.models;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

RecyclerView story,dashboard;
ArrayList<models>arrayList;
ArrayList<DashBoard>list;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_home, container, false);
        story = view.findViewById(R.id.storyRV);
        arrayList = new ArrayList<>();
       arrayList.add(new models(R.drawable.photo,R.drawable.photo,"Mohsin"));
       arrayList.add(new models(R.drawable.photo2,R.drawable.photo2,"Mohamad"));
       arrayList.add(new models(R.drawable.photo3,R.drawable.photo3,"MohamadInus"));
       arrayList.add(new models(R.drawable.profile,R.drawable.profile,"Bagwan"));
        StoryAdapter adapter = new StoryAdapter(arrayList,getContext());

        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        story.setLayoutManager(manager);
        story.setNestedScrollingEnabled(false);
        story.setAdapter(adapter);

        dashboard = view.findViewById(R.id.dashboard);
        list = new ArrayList<>();

        list.add(new DashBoard(R.drawable.profile,R.drawable.profile,R.drawable.ic_bookmark,
                "MohamadInus Bagwan","Mangor Hill Vasco-da-gama", "22k","2k","10k"));
        list.add(new DashBoard(R.drawable.photo2,R.drawable.photo2,R.drawable.ic_bookmark,
                "Mohsin  Bagwan","Mangor Hill Vasco-da-gama", "2k","100","1"));
        list.add(new DashBoard(R.drawable.photo,R.drawable.photo,R.drawable.ic_bookmark,
                "Abdul Razak Bagwan","Madgao,Goa", "242k","24k","104k"));
        list.add(new DashBoard(R.drawable.photo3,R.drawable.photo3,R.drawable.ic_bookmark,
                "Mohamad","Mangor Hill ", "22k","2k","10k"));

        DashBoardAdapter adapter1 = new DashBoardAdapter(list,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        dashboard.setLayoutManager(layoutManager);
        dashboard.setNestedScrollingEnabled(false);
        dashboard.setAdapter(adapter1);
        return view;

    }
}