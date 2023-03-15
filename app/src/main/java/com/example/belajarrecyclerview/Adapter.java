package com.example.belajarrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<DataModel> dataModels;

    public Adapter(ArrayList<DataModel> dataModels) {
        this.dataModels = dataModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView Nama;
        private TextView alamat;
        private TextView noTelp;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgUser);
            Nama =  itemView.findViewById(R.id.itemNama);
            alamat =  itemView.findViewById(R.id.itemAlamat);
            noTelp = itemView.findViewById(R.id.itemNoTelp);


        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataModel dataModel = dataModels.get(position);
        holder.imageView.setImageResource(dataModel.getGambar());
        holder.Nama.setText(dataModel.getNama());
        holder.alamat.setText(dataModel.getAlamat());
        holder.noTelp.setText(dataModel.getNoTelp());
    }

    @Override
    public int getItemCount() {
        return dataModels.size();
    }


}
