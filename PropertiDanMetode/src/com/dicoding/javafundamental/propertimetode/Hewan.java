package com.dicoding.javafundamental.propertimetode;

public class Hewan {
    double tinggi = 30;
    double berat = 3;
    int umur;

//    Hewan(int umurParam) {
//        umur = umurParam;
//    }

    Hewan(int umur) {
        this.umur = umur;
    }

    void lari() {
        System.out.println("Berlari");
    }

    void jalan() {
        System.out.println("Berjalan");
    }

    void makan() {
        System.out.println("Makan");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}
