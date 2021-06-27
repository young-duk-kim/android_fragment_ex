package com.example.flagment_ex_android;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class flagment_imageView extends Fragment {

    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup a = (ViewGroup)inflater.inflate(R.layout.fragment_flagment_image_view, container, false);
        imageView = a.findViewById(R.id.image_view);
        return a;
    }
}