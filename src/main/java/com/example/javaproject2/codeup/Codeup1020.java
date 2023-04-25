package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ssn[] = sc.next().split("-");    // 리스트 time을 생성해서 입력값을 추가해주는 과정
        System.out.println(ssn[0]  + ssn[1]);

    }
}