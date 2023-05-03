package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int factors = 0; // 약수의 개수
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i*i < num; i++) { // 1 ~ 6까지
            if(num % i == 0) factors++;
        }
        System.out.println(factors == 0 ? num + "은 소수입니다.": num + "은 소수가 아닙니다.");
    }
}
