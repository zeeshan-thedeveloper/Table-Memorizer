package com.example.table_memorizer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<TableDataHolder> {
    Context context;
    int resource;
    MainActivity mainActivity;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<TableDataHolder> objects,MainActivity mainActivity) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.mainActivity=mainActivity;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource,null);
        TableDataHolder tableDataHolder  = getItem(position);
        TextView table_title =  convertView.findViewById(R.id.txt_title);
        table_title.setText(tableDataHolder.getTable_name());
        Button btn_learn = convertView.findViewById(R.id.btn_learn);
        btn_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setTable(position+2);
            }
        });

        return convertView;
    }
}
