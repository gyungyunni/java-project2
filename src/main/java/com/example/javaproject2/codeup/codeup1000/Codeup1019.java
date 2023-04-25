package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\.");    // 리스트 time을 생성해서 입력값을 추가해주는 과정
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf("%04d.%02d.%02d",year, month, day);

    }
}