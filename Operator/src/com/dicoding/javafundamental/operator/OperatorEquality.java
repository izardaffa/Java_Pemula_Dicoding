package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah " + result + "\n");

        System.out.println("Tidak sama dengan...");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result + "\n");

        System.out.println("Lebih dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result + "\n");

        System.out.println("Lebih dari atau sama dengan...");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result + "\n");

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result + "\n");

        System.out.println("Kurang dari atau sama dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'value <= anotherValue' adalah " + result + "\n");
    }
}
