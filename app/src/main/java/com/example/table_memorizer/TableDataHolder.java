package com.example.table_memorizer;

public class TableDataHolder {
    String table_name;
    int image;
    public TableDataHolder(String table_name,int image) {
        this.image=image;
        this.table_name = table_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }
}
