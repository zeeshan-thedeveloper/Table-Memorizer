package com.example.table_memorizer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class StartScreen_Fragment extends Fragment {

   MainActivity mainActivity;
    public StartScreen_Fragment(MainActivity mainActivity) {
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
        View view = inflater.inflate(R.layout.fragment_start_screen_, container, false);
        Button btn_memorize = view.findViewById(R.id.btn_memorize);
        Button btn_learn_table = view.findViewById(R.id.btn_learn_tables);
        Button btn_about_app = view.findViewById(R.id.btn_about_app);

        btn_memorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTrainingOptionsScreen();
            }
        });
        btn_learn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setListOfTablesForLearning();
            }
        });
        btn_about_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setAboutApp();
            }
        });
        return view;
    }
}