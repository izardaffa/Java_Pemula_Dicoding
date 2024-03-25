package com.dicoding.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormated = sdf.format(new Date());
        System.out.println(new Date());
        System.out.println(dateFormated);
    }
}
