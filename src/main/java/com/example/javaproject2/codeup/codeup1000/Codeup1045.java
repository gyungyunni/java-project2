package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int minus = num1-num2;
        int mul = num1 * num2;
        int quo = num1 / num2;
        int rem = num1%num2;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(quo);
        System.out.println(rem);
        float Num1 = (float) num1;
        System.out.printf("%.2f\n", Num1/num2);
    }
}