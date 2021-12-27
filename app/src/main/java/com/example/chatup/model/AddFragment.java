package com.example.chatup.model;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.chatup.R;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class AddFragment extends Fragment {
FloatingActionButton btn;
ImageView imageView;
    public AddFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        btn = view.findViewById(R.id.floatingActionButton);
        imageView = view.findViewById(R.id.post);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImagePicker.with(AddFragment.this)
                        .crop()
                        .compress(1024)
                        .maxResultSize(1080, 1080)
                        .start();
            }


        });
        return view;
    }
    public void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData();
        imageView.setImageURI(uri);
    }
}