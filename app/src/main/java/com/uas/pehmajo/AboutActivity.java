package com.uas.pehmajo;

import android.os.PersistableBundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AboutActivity extends AppCompatActivity {
    private RecyclerView rvRestoran;
    private ArrayList<ModelKelompok> data = new ArrayList<>();

    @Override
    protected void onCreate(PersistableBundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        rvRestoran = findViewById(R.id.rv_restoran);
        rv_kelompok
    }

}
