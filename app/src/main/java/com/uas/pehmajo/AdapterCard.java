package com.uas.pehmajo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

import java.util.ArrayList;

public class AdapterCard extends RecyclerView.Adapter<AdapterCard.CardViewHolder> {
    private ArrayList<ModelRestoran> dataRestoran;
    private Context ctx;

    public AdapterCard(ArrayList<ModelRestoran> dataRestoran, Context ctx) {
        this.dataRestoran = dataRestoran;
        this.ctx = ctx;
    }

    public AdapterCard(ArrayList<ModelKelompok> data, AboutActivity ctx) {
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
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
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
                String xNama, xTentang, xFoto, xKoordinat, xAlamat, xTelphone;

                xNama = restoran.getNama();
                xTentang = restoran.getTentang();
                xFoto = restoran.getFoto();
                xKoordinat = restoran.getKoordinat();
                xAlamat = restoran.getAlamat();
                xTelphone = restoran.getTelphone();

                Intent kirim = new Intent(ctx, DetailActivity.class);
                kirim.putExtra("xNama", xNama);
                kirim.putExtra("xTentang", xTentang);
                kirim.putExtra("xFoto", xFoto);
                kirim.putExtra("xKoordinat", xKoordinat);
                kirim.putExtra("xAlamat", xAlamat);
                kirim.putExtra("xTelphone", xTelphone);
                ctx.startActivity(kirim);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataRestoran.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvTentang;
        ImageView ivFoto;

        public CardViewHolder(@NonNull View itemView){
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvTentang = itemView.findViewById(R.id.tv_tentang);
            ivFoto = itemView.findViewById(R.id.iv_foto);
        }
    }
}