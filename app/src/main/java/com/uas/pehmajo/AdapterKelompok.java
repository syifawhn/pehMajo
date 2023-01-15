package com.uas.pehmajo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterKelompok extends RecyclerView.Adapter<AdapterKelompok.CardViewHolder> {
    private ArrayList<ModelKelompok> dataAnggota;

    public AdapterKelompok(ArrayList<ModelKelompok> dataAnggota, AboutActivity aboutActivity){
        this.dataAnggota = dataAnggota;
    }


    @NonNull
    @Override
    public AdapterKelompok.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar_kelompok, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKelompok.CardViewHolder holder, int position) {
        ModelKelompok kelompok = dataAnggota.get(position);
        holder.nama_anggota.setText(kelompok.getAnggota());
        holder.tv_deskripsi.setText(kelompok.getDeskripsi());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = dataAnggota.get(holder.getAdapterPosition()).getAnggota();
                String deskripsi = dataAnggota.get(holder.getAdapterPosition()).getDeskripsi();
            }
        });
    }

    @Override
    public int getItemCount() { return dataAnggota.size();}

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView nama_anggota, tv_deskripsi;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_anggota = itemView.findViewById(R.id.tv_nama_anggota);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi);
        }
    }
}
