package com.uas.pehmajo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Instant;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTentang, tvAlamat;
    private String yNama, yTentang, yFoto, yKoordinat, yAlamat, yTelphone;
    private Button btnTelphone, btnLokasi;
    private android.view.View.OnClickListener View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Peh Majo'");
        btnLokasi = findViewById(R.id.btn_lokasi);
        btnTelphone = findViewById(R.id.btn_telphone);
        tvAlamat = findViewById(R.id.tv_alamat);
        initView();

        Intent terima = getIntent();
        yNama = terima.getStringExtra("xNama");
        yTentang = terima.getStringExtra("xTentang");
        yFoto = terima.getStringExtra("xFoto");
        yAlamat = terima.getStringExtra("xAlamat");
        yTelphone = terima.getStringExtra("xTelphone");
        yKoordinat = terima.getStringExtra("xKoordinat");

        tvNama.setText(yNama);
        tvTentang.setText(yTentang);
        tvAlamat.setText(yAlamat);

        Glide

        btnLokasi.setOnClickListener (View);
    }

}
