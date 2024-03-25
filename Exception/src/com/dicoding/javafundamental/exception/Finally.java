package com.dicoding.javafundamental.exception;

public class Finally {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            a[4] = 10;
            System.out.println(a[4]);
        }
    }
}
