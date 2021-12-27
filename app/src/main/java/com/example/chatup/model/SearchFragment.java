package com.example.chatup.model;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.RecoverySystem;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatup.R;
import com.example.chatup.Search;
import com.example.chatup.SearchAdapter;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
RecyclerView recyclerView;
ArrayList<Search>list;

    public SearchFragment() {
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
      View view =  inflater.inflate(R.layout.fragment_search, container, false);
      recyclerView = view.findViewById(R.id.cycle);
      list = new ArrayList<>();
      list.add(new Search(R.drawable.photo,R.drawable.photo2,R.drawable.photo3));
      list.add(new Search(R.drawable.photo3,R.drawable.photo,R.drawable.photo2));
      list.add(new Search(R.drawable.profile,R.drawable.photo3,R.drawable.photo));
      list.add(new Search(R.drawable.photo2,R.drawable.profile,R.drawable.photo));
      list.add(new Search(R.drawable.photo,R.drawable.photo2,R.drawable.photo3));
      list.add(new Search(R.drawable.profile,R.drawable.photo,R.drawable.photo2));
      list.add(new Search(R.drawable.photo2,R.drawable.photo3,R.drawable.photo2));
      list.add(new Search(R.drawable.photo3,R.drawable.profile,R.drawable.photo));
      list.add(new Search(R.drawable.profile,R.drawable.photo2,R.drawable.photo));
      list.add(new Search(R.drawable.photo2,R.drawable.photo,R.drawable.photo2));
      list.add(new Search(R.drawable.photo,R.drawable.photo3,R.drawable.photo));
      list.add(new Search(R.drawable.photo3,R.drawable.photo2,R.drawable.profile));
      SearchAdapter adapter = new SearchAdapter(list,getContext());
      LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
      recyclerView.setLayoutManager(layoutManager);
      recyclerView.setNestedScrollingEnabled(false);
      recyclerView.setAdapter(adapter);
      return view;
    }
}