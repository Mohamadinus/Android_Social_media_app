package com.example.chatup.model;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatup.R;
import com.example.chatup.profile;
import com.example.chatup.profileAdapter;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.makeramen.roundedimageview.RoundedImageView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Observer;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileFragment extends Fragment {
    SQLiteDatabase sqLiteDatabase;
RecyclerView profile;
ArrayList<profile>list;
FloatingActionButton btn1,btn2;
CircleImageView cover2;
RoundedImageView cover;
    public ProfileFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_profile, container, false);
        btn1 = view.findViewById(R.id.coverPhoto);
        cover=view.findViewById(R.id.profileImage);
        cover2 = view.findViewById(R.id.profile);
        btn2 = view.findViewById(R.id.addPhoto);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ImagePicker.with(ProfileFragment.this)
                            .crop()
                            .compress(1024)
                            .maxResultSize(1080, 1080)
                            .start(1);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }



        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    ImagePicker.with(ProfileFragment.this)
                            .crop()
                            .compress(1024)
                            .maxResultSize(1080, 1080)
                            .start(2);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        profile = view.findViewById(R.id.cycle);
        list = new ArrayList<>();
        list.add(new profile(R.drawable.profile));
        list.add(new profile(R.drawable.photo));
        list.add(new profile(R.drawable.photo2));
        list.add(new profile(R.drawable.photo3));
        list.add(new profile(R.drawable.profile));
        list.add(new profile(R.drawable.photo));
        list.add(new profile(R.drawable.photo2));
        list.add(new profile(R.drawable.photo3));
        profileAdapter adapter = new profileAdapter(list,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        profile.setLayoutManager(layoutManager);
        profile.setNestedScrollingEnabled(false);
        profile.setAdapter(adapter);
        return view;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            Uri uri = data.getData();
            cover.setImageURI(uri);
        }else {
            Uri uri = data.getData();
            cover2.setImageURI(uri);
        }
    }
}