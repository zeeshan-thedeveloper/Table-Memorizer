package com.example.table_memorizer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<TableDataHolder> {
    Context context;
    int resource;
    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<TableDataHolder> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource,null);
        TableDataHolder tableDataHolder  = getItem(position);
        TextView txt_table_title = convertView.findViewById(R.id.txt_table_title);
        ImageButton btn_learn = convertView.findViewById(R.id.btn_leanr_table);
        txt_table_title.setText(tableDataHolder.getTable_name());
        btn_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Start learning the table", Toast.LENGTH_SHORT).show();
            }
        });
        
        return convertView;
    }
}
