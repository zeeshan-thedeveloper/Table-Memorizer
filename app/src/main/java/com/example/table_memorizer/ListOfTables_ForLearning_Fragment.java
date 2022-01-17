package com.example.table_memorizer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class ListOfTables_ForLearning_Fragment extends Fragment {

   MainActivity mainActivity;
    public ListOfTables_ForLearning_Fragment(MainActivity mainActivity) {
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
        View view = inflater.inflate(R.layout.fragment_list_of_tables__for_learning_, container, false);
        ListView listView = view.findViewById(R.id.lis_of_tables);
        ImageButton btn_back = view.findViewById(R.id.btn_back_from_list_of_tables);
        List<TableDataHolder> tableDataHolderList = new ArrayList<>();
        tableDataHolderList.add(new TableDataHolder("1X"));
        tableDataHolderList.add(new TableDataHolder("2X"));
        tableDataHolderList.add(new TableDataHolder("3X"));
        tableDataHolderList.add(new TableDataHolder("4X"));
        tableDataHolderList.add(new TableDataHolder("5X"));
        tableDataHolderList.add(new TableDataHolder("6X"));

        CustomAdapter customAdapter = new CustomAdapter(mainActivity,R.layout.table_list_item,tableDataHolderList);

        listView.setAdapter(customAdapter);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setStartScreen();
            }
        });
        return view;
    }
}