package com.uas.pehmajo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private RecyclerView rv_anggota;
    private ArrayList<ModelKelompok> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        rv_anggota = findViewById(R.id.rv_anggota);
        rv_anggota.setHasFixedSize(true);

        data.addAll(AboutKelompok.ambilDataKelompok());
        tampilDataCard();
    }

    private void tampilDataCard() {
        rv_anggota.setLayoutManager(new LinearLayoutManager(this));
        AdapterKelompok AC = new AdapterKelompok(data, AboutActivity.this);
        rv_anggota.setAdapter(AC);
    }
}
