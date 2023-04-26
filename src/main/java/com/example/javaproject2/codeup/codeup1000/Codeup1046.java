package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(num1+num2+num3);
        float Num1 = (float) num1;
        float Num2 = (float) num2;
        float Num3 = (float) num3;
        System.out.printf("%.1f",(Num1+Num2+Num3)/3);
    }
}