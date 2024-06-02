package com.example.thesmurfs.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidx.appcompat.widget.SearchView;





import com.example.thesmurfs.R;
import com.example.thesmurfs.models.DataModle;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder> {


    private ArrayList<DataModle> dataSet;

    public CustomeAdapter(
            ArrayList<DataModle> dataSet) {
        this.dataSet = dataSet;


    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewDescribe;

        ImageView imageViewIcon;

        CardView cardView;


//        @NonNull
//        @Override
//        protected Object clone() throws CloneNotSupportedException {
//
//        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardViewRes);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDescribe = itemView.findViewById(R.id.textViewDescribe);
            imageViewIcon = itemView.findViewById(R.id.imageView);


        }
    }

    @NonNull
    @Override
    public CustomeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,
                parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CustomeAdapter.MyViewHolder holder, int position) {

        TextView textViewName = holder.textViewName;
        TextView textViewDescribe = holder.textViewDescribe;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(position).getName());
        textViewDescribe.setText(dataSet.get(position).getDescribe());
        imageView.setImageResource(dataSet.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void setFilterdList(ArrayList<DataModle> filteredList){
      this.dataSet= filteredList;
      notifyDataSetChanged();
    }

}