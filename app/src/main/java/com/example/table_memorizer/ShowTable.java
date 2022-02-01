package com.example.table_memorizer;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ShowTable extends Fragment {

    MainActivity mainActivity;
    int image;
    public ShowTable(MainActivity mainActivity,int image) {
        this.mainActivity=mainActivity;
        this.image=image;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show_table, container, false);
        ImageButton btn_close_table = view.findViewById(R.id.btn_close_table);
        ImageView image_table_holder=  view.findViewById(R.id.img_table_holder);
        Button btn_go_for_testing  = view.findViewById(R.id.btn_go_for_training);

        image_table_holder.setImageResource(image);
        btn_close_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setListOfTablesForLearning();
            }
        });
        btn_go_for_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTrainingOptionsScreen();
            }
        });
        return view;
    }
}