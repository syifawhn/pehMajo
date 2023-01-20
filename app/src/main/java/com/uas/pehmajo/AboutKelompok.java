package com.uas.pehmajo;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AboutKelompok extends AppCompatActivity {

    public static String[][] data = new String[][]{

            {"1. Grace Kelly Suryadinatan 2024240057 \n2. Nabila Syiva Altarisa 2024240114 \n3.Syifa Wahyuni 2024240115",
                    "Project ini dikerjakan untuk memenuhi nilai ujian akhir semester mata kuliah Pemrograman Aplikasi Bergerak (PAB) Semester 5 dengan dosen pengampu Bapak Ahmad Farisi, M.Kom" }

    };

    public static ArrayList<ModelKelompok> ambilDataKelompok(){
        ArrayList<ModelKelompok> dataKelompok = new ArrayList<>();
        for (String[] varData : data){
            ModelKelompok modelKelompok = new ModelKelompok();
            modelKelompok.setAnggota(varData[0]);
            modelKelompok.setDeskripsi(varData[1]);

            dataKelompok.add(modelKelompok);
        }
        return dataKelompok;
    }
}
