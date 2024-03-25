package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.add(Calendar.DATE, -15);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, 4);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 2);
        System.out.println(calendar.getTime());
    }
}
