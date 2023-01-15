package com.uas.pehmajo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.GridViewHolder> {
    private ArrayList<ModelRestoran> dataRestoran;

    public AdapterGrid(ArrayList<ModelRestoran> dataRestoran) {this.dataRestoran = dataRestoran;}

    public interface OnItemClickCallBack {
        void onItemClicked(ModelRestoran data);
    }
    private AdapterGrid.OnItemClickCallBack callBack;
    public void setOnItemClickBack(OnItemClickCallBack callBack) {this.callBack = callBack;}

    @NonNull
    @Override
    public AdapterGrid.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);

        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        ModelRestoran restoran = dataRestoran.get(position);

        Glide.with(holder.itemView.getContext()).load(restoran.getFoto()).into(holder.ivItemGrid);
    }

    @Override
    public int getItemCount() {return dataRestoran.size();}

    public class GridViewHolder extends RecyclerView.ViewHolder{
        ImageView ivItemGrid;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            ivItemGrid = itemView.findViewById(R.id.iv_item_grid);
        }
    }
}
