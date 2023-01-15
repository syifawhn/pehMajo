package com.uas.pehmajo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private ArrayList<ModelRestoran> dataRestoran;
    private Context ctx;

    public AdapterCard(ArrayList<ModelRestoran> dataRestoran, Context ctx) {
        this.dataRestoran = dataRestoran;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.item_card, parent, false);
        return new CardViewHolder(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCard.CardViewHolder holder, int position) {
        ModelRestoran restoran = dataRestoran.get(position);
        holder.tvNama.setText(restoran.getNama());
        holder.tvTentang.setText(restoran.getTentang());

        Glide
                .with(ctx)
                .load(restoran.getFoto())
                .centerCrop()
                .into(holder.ivFoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String xNama, xTentang, xFoto;

                xNama = restoran.getNama();
                xTentang = restoran.getTentang();
                xFoto = restoran.getFoto();

                Intent kirim = new Intent(ctx, DetailActivity.class);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
    }


}