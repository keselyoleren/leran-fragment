package com.example.fragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragment.R;

import org.w3c.dom.Text;


public class Settings extends Fragment {

    private TextView textView;
    public Settings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        textView = view.findViewById(R.id.text_settings);
        textView.setText("ini adalah page sttings");
        return view;
    }

}