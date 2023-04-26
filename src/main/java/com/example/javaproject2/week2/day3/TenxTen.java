package com.example.javaproject2.week2.day3;

import java.util.Arrays;

public class TenxTen {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------------------------");
        int[][] arr10x10 = new int[10][10]; // 배열 선언과 초기화
        System.out.println(Arrays.toString(arr10x10[0]));
        System.out.println(Arrays.toString(arr10x10[1]));
        System.out.println(Arrays.toString(arr10x10[2]));
        System.out.println(Arrays.toString(arr10x10[3]));
        System.out.println(Arrays.toString(arr10x10[4]));
        System.out.println(Arrays.toString(arr10x10[5]));
        System.out.println(Arrays.toString(arr10x10[6]));
        System.out.println(Arrays.toString(arr10x10[7]));
        System.out.println(Arrays.toString(arr10x10[8]));
        System.out.println(Arrays.toString(arr10x10[9]));
        System.out.println("----------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }

    }
}