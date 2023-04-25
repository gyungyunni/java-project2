package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");

        String str1 = "GOLD";
        String str2 = "G";

        // st1번의 G와 str2번이 같은지?
        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println(isSame);
    }
}
