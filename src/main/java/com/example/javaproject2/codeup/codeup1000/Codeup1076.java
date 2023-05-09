package com.example.javaproject2.codeup.codeup1000;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char alp = str.charAt(0);
        for(int i = 97; i <= (int)alp; i++)
            System.out.printf("%c ",i);
    }
}
