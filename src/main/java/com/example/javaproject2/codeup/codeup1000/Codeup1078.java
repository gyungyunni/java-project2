package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum = 0;
        for(int i = 0; i <= num; i++){
            if(i % 2 == 0)
                evenSum += i;
        }
        System.out.println(evenSum);
    }
}