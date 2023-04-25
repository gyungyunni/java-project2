package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.next(), 16);

        System.out.println(Integer.toOctalString(num));
    }
}