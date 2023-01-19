package com.uas.pehmajo;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvRestoran;
    private ArrayList<ModelRestoran> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRestoran = findViewById(R.id.rv_restoran);
        rvRestoran.setHasFixedSize(true);

        data.addAll(DataRestoran.ambilDataRestoran());
        tampilDataRestoran();
    }

    private void tampilDataRestoran() {
        rvRestoran.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard kontakCard = new AdapterCard(data, MainActivity.this);
        rvRestoran.setAdapter(kontakCard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_pilihan, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.about){
            startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
