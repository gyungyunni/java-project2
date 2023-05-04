package com.example.javaproject2.week3.day4;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int max = arr[0][0];
        int row = 0;
        int col =0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d\n",row+1,col+1);

    }
}
