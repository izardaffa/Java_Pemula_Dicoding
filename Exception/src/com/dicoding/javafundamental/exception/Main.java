package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            String location = "D://file.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);

            System.out.println("Sukses");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
