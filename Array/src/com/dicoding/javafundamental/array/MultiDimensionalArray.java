package com.dicoding.javafundamental.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] arrayChar = new char[2][];

        arrayChar[0] = new char[2];
        arrayChar[1] = new char[3];

        arrayChar[0][0] = 'A';
        arrayChar[0][1] = 'B';

        arrayChar[1][0] = 'C';
        arrayChar[1][1] = 'D';
        arrayChar[1][2] = 'E';

        System.out.println(arrayChar[0][0]);
        System.out.println(arrayChar[0][1]);

        System.out.println(arrayChar[1][0]);
        System.out.println(arrayChar[1][1]);
        System.out.println(arrayChar[1][2]);
    }
}
