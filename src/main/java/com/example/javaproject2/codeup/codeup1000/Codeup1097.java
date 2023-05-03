package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        int num;
        int x_point, y_point;
        int[][] arr = new int[19][19];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            x_point = sc.nextInt();
            y_point = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                if(arr[x_point-1][j] == 0){
                    arr[x_point-1][j] = 1;
                }
                else
                    arr[x_point-1][j] = 0;
            }
            for (int j = 0; j < 19; j++) {
                if(arr[j][y_point-1] == 0){
                    arr[j][y_point-1] = 1;
                }
                else
                    arr[j][y_point-1] = 0;
            }
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
