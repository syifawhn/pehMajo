package com.uas.pehmajo;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AboutKelompok extends AppCompatActivity {

    public static String[][] data = new String[][]{
            {"1. Grace Kelly Suryadinatan 2024240057 \n", "2. Nabila Syiva Altarisa 2024240114 \n", "Syifa Wahyuni 2024240115 \n" + "Project ini dikerjakan untuk memenuhi nilai tugas akhir mata kuliah Pemrograman Aplikasi Bergerak (PAB) Semester 5 dengan dosen pengampu Bapak Ahmad Farisi, M.Kom"},
    };

    public static ArrayList<ModelKelompok> ambilDataKelompok(){
        ArrayList<ModelKelompok> aboutKelompok = new ArrayList<>();
        for (String[] varData : data){
            ModelKelompok modelKelompok = new ModelKelompok();
            modelKelompok.setAnggota(varData[0]);
            modelKelompok.setPenjelasan(varData[1]);

            aboutKelompok.add(modelKelompok);
        }
        return aboutKelompok;
    }
}
