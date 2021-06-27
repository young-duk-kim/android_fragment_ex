package com.example.flagment_ex_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements fragment_main_ex.ImageSelectionCallback{
    fragment_main_ex list_fragment;
    flagment_imageView image_fragment;
    ImageView imageView;
    int[] image = {R.drawable.cat1,R.drawable.cat2,R.drawable.cat3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        list_fragment = (fragment_main_ex)manager.findFragmentById(R.id.listfragment);
        image_fragment = (flagment_imageView)manager.findFragmentById(R.id.image_flagement);
        imageView = findViewById(R.id.image_view);
    }

    @Override
    public void imageSelected(int position) {
        imageView.setImageResource(image[position]);
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();
    }
}