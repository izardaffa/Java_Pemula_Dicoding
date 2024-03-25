package com.dicoding.javafundamental.array;

public class IndexOutOfBound {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        System.out.println(arrayA[4]);
    }
}
