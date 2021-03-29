package com.sugeB;

import java.util.HashMap;

public class Mahasiswa {

    HashMap<String, String> data;

    public void setData(HashMap<String, String> data) {
        this.data = data;
    }

    Mahasiswa(HashMap<String, String> data) {
        this.data = data;
    }

    public void outputDataMahasiswa() {
        double nilaiRataRata = (Integer.parseInt(data.get("nilaiUts")) + Integer.parseInt(data.get("nilaiUas"))) / (2.0);
        System.out.println("Perkenalkan nama saya " + data.get("nama") + ", nim " + data.get("nim") + ",");
        System.out.println("Usia : " + data.get("usia"));
        System.out.println("Nilai Akhir : " + nilaiRataRata);
    }

}
