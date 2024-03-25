package com.dicoding.javafundamental.propertimetode;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();

        System.out.println("Umur = " + kucing.getUmur());

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Index massa tubuhnya adalah " + bmi);
    }
}
