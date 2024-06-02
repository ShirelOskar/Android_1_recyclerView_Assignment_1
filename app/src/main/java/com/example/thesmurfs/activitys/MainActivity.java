package com.example.thesmurfs.activitys;

import static android.provider.Settings.System.getString;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.widget.SearchView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thesmurfs.R;
import com.example.thesmurfs.adapters.CustomeAdapter;
import com.example.thesmurfs.models.DataModle;
import com.example.thesmurfs.services.MyData;

import java.util.ArrayList;
import android.app.SearchManager;

import android.widget.SearchView.OnQueryTextListener;

public class MainActivity extends AppCompatActivity {


    private ArrayList<DataModle> dataSet;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private CustomeAdapter adapter;

    private SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleViewResult);
        searchView = findViewById(R.id.search_view);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterList(newText);


                return true;
            }
        });


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        dataSet = new ArrayList<>();
        for (int i = 0; i < MyData.nameArray.length; i++) {

            dataSet.add(new DataModle(
                    MyData.nameArray[i],
                    MyData.describeArray[i],
                    MyData.drawableArray[i],
                    MyData.id_[i]
            ));

            adapter = new CustomeAdapter(dataSet);
            recyclerView.setAdapter(adapter);

        }


    }

    private void filterList(String text) {
        ArrayList<DataModle> filteredList = new ArrayList<>();
       for(DataModle item : dataSet  ){
           if(item.getName().toLowerCase().contains(text.toLowerCase())){
               filteredList.add(item);

           }
       }
       if(filteredList.isEmpty()){
           adapter.setFilterdList(dataSet);
           Toast.makeText(this,"No data found",Toast.LENGTH_SHORT).show();

       }

       else{
           adapter.setFilterdList(filteredList);

       }
    }


}

