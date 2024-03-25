package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukkan panjang: ");
                s1 = scanner.nextInt();

                System.out.print("Masukkan lebar: ");
                s2 = scanner.nextInt();

                System.out.println("Luas: " + opersegi.luas(s1, s2));
                System.out.println("Keliling: " + opersegi.keliling(s1, s2));

                break;
            }
            case '2': {
                System.out.print("Masukka alas: ");
                s1 = scanner.nextInt();

                System.out.print("Masukkan tinggi: ");
                s2 = scanner.nextInt();

                System.out.println("Luas: " + osegitiga.luas(s1, s2));
                System.out.println("Keliling: " + osegitiga.keliling(s1, s2));

                break;
            }
            case '3': {
                System.out.print("Masukkan jari-jari: ");
                r = scanner.nextInt();

                System.out.println("Luas: " + olingkaran.luas(r));
                System.out.println("Keliling: " + olingkaran.keliling(r));

                break;
            }
            default: {
                System.out.println("Diluar jangkauan.");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("=====================");
        System.out.println("Hitung Luas dan Keliling:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Pilihan: ");
        pilihan = scanner.next().charAt(0);
    }
}
