package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean result = num1 == 0 & num2 == 1 || num1 == 1 & num2 == 0;
        if(result)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
