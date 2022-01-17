package com.example.table_memorizer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class TrainingOptionsScreen_Fragment extends Fragment {

    MainActivity mainActivity;
    public TrainingOptionsScreen_Fragment(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity=mainActivity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_training_options_screen_, container, false);
        ImageView img_input = view.findViewById(R.id.img_typ_input);
        ImageView img_true_false = view.findViewById(R.id.img_true_false);
        ImageButton btn_back = view.findViewById(R.id.btn_back);

        img_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setInputTraining();
            }
        });
        img_true_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTrueFalseTraining();
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setStartScreen();
            }
        });
        return view;
    }
}