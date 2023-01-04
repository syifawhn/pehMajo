package com.uas.pehmajo;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    public Object setOnItemClickCallBack;

    public AdapterCard(ArrayList<ModelRestoran> dataRestoran) {
    this.dataRestoran = dataRestoran;
    }

    public interface OnItemClickCallBack{
        void onItemClicked(ModelRestoran data);
    }

    private AdapterGrid.OnItemClickCallBack callBack;
    public void setSetOnItemClickCallBack(AdapterGrid.OnItemClickCallBack callBack){
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public AdapterCard.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCard.CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
