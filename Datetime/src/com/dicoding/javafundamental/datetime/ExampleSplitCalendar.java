package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSplitCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
