package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        int num;
        int x_point, y_point;
        int[][] arr = new int[20][20];
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            x_point = sc.nextInt();
            y_point = sc.nextInt();
            arr[x_point][y_point] = 1;
        }
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
