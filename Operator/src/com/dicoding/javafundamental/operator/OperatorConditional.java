package com.dicoding.javafundamental.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        boolean benar = true;
        boolean salah = false;

        boolean result;
        boolean result2;
        boolean result3;

        // AND
        result = benar && benar;
        result2 = benar && salah;
        result3 = salah && salah;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        // OR
        result = benar || benar;
        result2 = benar || salah;
        result3 = salah || salah;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
