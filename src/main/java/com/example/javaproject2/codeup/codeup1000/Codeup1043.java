package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int remain = num1%num2;
        System.out.println(remain);
    }
}