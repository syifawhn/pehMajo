package com.uas.pehmajo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private ImageView ivFoto;
    private TextView tvNama, tvTentang, tvAlamat;
    private String yNama, yTentang, yFoto, yKoordinat, yAlamat, yTelphone;
    private Button btnTelphone, btnLokasi;
    //private android.view.View.OnClickListener View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setTitle("Peh Majo");
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
                .with(DetailActivity.this)
                .load(yFoto)
                .into(ivFoto);

        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                String lokasi = tvNama.getText().toString();
                Uri UriLokasi =Uri.parse("geo:0,0?q=" + yKoordinat);
                Intent openLokasi = new Intent(Intent.ACTION_VIEW, UriLokasi);
                startActivity(openLokasi);

            }
        });

        btnTelphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telphone = tvNama.getText().toString();
                Intent bukaTelphone = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telphone, "null"));
                startActivity(bukaTelphone);
            }
        });
    }
    private void initView(){
        ivFoto = findViewById(R.id.iv_foto);
        tvNama = findViewById(R.id.tv_nama);
        tvTentang = findViewById(R.id.tv_tentang);
    }


}
