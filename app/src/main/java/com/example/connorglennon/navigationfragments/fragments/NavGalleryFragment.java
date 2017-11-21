package com.example.connorglennon.navigationfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.connorglennon.navigationfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavGalleryFragment extends Fragment {


    public NavGalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_gallery, container, false);
    }

}
