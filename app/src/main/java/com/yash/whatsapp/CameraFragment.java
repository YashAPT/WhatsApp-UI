package com.yash.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class CameraFragment extends Fragment {

    View view;

    public CameraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      view =  inflater.inflate(R.layout.fragment_camera, container, false);

        ImageView image = view.findViewById(R.id.camera);
        image.setImageResource(R.drawable.camera);



      return view;
    }
}
