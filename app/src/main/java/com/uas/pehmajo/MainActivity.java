package com.uas.pehmajo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class MainActivity extends AppCompatActivity {
    private RecyclerView rvRestoran;
    private ArrayList<ModelRestoran> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Daftar Restoran");
        rvRestoran = findViewById(R.id.rv_restoran);
        rvRestoran.setHasFixedSize(true);

        data.addAll(DataRestoran.ambilDataRestoran());
        tampilDataRestoran();
    }

    private void tampilDataRestoran() {
        rvRestoran.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard kontakCard = new AdapterCard(data);
        rvRestoran.setAdapter(kontakCard);

        kontakCard.setOnItemClickCallBack(new AdapterGrid.OnItemClickCallBack(){
            @Override
            public void onItemClicked(ModelRestoran data){
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("xNama", data.getNama());
                pindah.putExtra("xTentang", data.getTentang());
                pindah.putExtra("xFoto", data.getFoto());
                startActivity(pindah);
            }
        }

    }
}
