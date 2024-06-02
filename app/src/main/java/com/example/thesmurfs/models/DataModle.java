package com.example.thesmurfs.models;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;
public class DataModle {

    String name;

    String describe;

    int image;

    int id;



    public DataModle(String name, String describe, int image, int id) {

        this.name = name;

        this.describe = describe;

        this.image = image;

        this.id = id;

    }



    public String getName() {

        return name;

    }



    public String getDescribe() {

        return describe;

    }



    public int getImage() {

        return image;

    }



    public int getId() {

        return id;

    }


}
