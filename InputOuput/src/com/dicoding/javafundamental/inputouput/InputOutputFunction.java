package com.dicoding.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program penjumlahan sederhana");

        System.out.print("Masukkan angka pertama: ");
        int firstValue = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int secondValue = scanner.nextInt();

        int result = firstValue + secondValue;
        System.out.println("Hasilnya = " + result);
    }
}
