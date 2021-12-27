package com.example.chatup.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.chatup.R;
import com.example.chatup.viewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class NotificationFragment extends Fragment {
ViewPager viewPager;
TabLayout layout;

    public NotificationFragment() {
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
       View view = inflater.inflate(R.layout.fragment_notification, container, false);
       viewPager = view.findViewById(R.id.viewPager) ;
       viewPager.setOffscreenPageLimit(2);
       viewPager.setAdapter(new viewPagerAdapter(getChildFragmentManager()));

       layout = view.findViewById(R.id.tabLayout);
       layout.setupWithViewPager(viewPager);

       return view;
    }
}