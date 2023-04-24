package com.example.javaproject2.week2.day1;

public class FloatParsing {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";

        Float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result = " + result);
    }
}
