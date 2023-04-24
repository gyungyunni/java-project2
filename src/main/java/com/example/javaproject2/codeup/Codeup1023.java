package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parse = str.split("\\.");
        System.out.println(parse[0] + "\n" +parse[1]);
    }
}