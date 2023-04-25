package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time[] = sc.next().split(":");    // 리스트 time을 생성해서 입력값을 추가해주는 과정
        System.out.println(time[0] + ":" + time[1]);

    }
}