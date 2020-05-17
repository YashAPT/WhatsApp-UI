package com.yash.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class StatusFragment extends Fragment {

    View view;

    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_status, container, false);

        ImageView image1 = view.findViewById(R.id.image1);
        ImageView image2 = view.findViewById(R.id.image2);

        TextView status1 = view.findViewById(R.id.myStatus1);
        TextView status2 = view.findViewById(R.id.myStatus2);

        TextView update1 = view.findViewById(R.id.update1);
        TextView update2 = view.findViewById(R.id.update2);
        TextView recent = view.findViewById(R.id.recent_updates);


        image1.setImageResource(R.drawable.aj);
        image2.setImageResource(R.drawable.myimage);

        status1.setText("My Status");
        status2.setText("SomeOne");
        update1.setText("Tap to add status update");
        update2.setText("Today 5:40 pm");
        recent.setText("Recent Updates");


        return view;
    }
}
