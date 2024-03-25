package com.dicoding.javafundamental.accessmodifier.package3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Perhitungan.nilai);

        for (int i = 0; i < 5; i++) {
            new Perhitungan();
        }

        System.out.println(Perhitungan.nilai);
        System.out.println(Perhitungan.getNilai());
    }
}
