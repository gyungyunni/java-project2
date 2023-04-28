package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 >= 90 && num1 <= 100) {
            System.out.println("A");
        } else if (num1 >= 70 && num1 <= 89) {
            System.out.println("B");
        } else if (num1 >= 40 && num1 <= 69) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}