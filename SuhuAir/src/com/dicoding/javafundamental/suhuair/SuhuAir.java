package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        int T;

        System.out.println("Menentukan Bentuk Air");
        System.out.print("Suhu Celcius: ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if (T < 0) {
            System.out.println("Beku");
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Cair");
        } else if (T > 100) {
            System.out.println("Gas/Uap");
        }
    }
}
