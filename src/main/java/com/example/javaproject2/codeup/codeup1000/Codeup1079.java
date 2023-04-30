package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char alp = 0;
        while (alp != 'q') {
            alp = sc.next().charAt(0);
            System.out.println(alp);
        }

    }
}