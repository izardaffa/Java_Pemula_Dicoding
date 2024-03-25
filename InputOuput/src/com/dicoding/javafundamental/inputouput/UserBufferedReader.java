package com.dicoding.javafundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        System.out.println("Program ppenjumlahan sederhana");

        int firstValue = 0;
        int secondValue = 0;

        try {
            System.out.print("Masukkan angka pertama: ");
            firstValue = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Masukkan angka kedua: ");
            secondValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = firstValue + secondValue;
        System.out.println("Hasilnya = " + result);
    }
}
