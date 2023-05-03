package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                arr[i][k] = sc.nextInt();
            }
        }
        int count = 1; //다음줄로 넘어갈 때 1을 만났던 자릿수를 기억하는 역할
        boolean two = false;
        int row, col = 1;

        for (row = 1; row < 9; row++) {
            for (col = count; col < 10; col++) {

                if(arr[row][col] == 0){
                    arr[row][col] = 9;
                }
                else if(arr[row][col] == 1){
                    count = col - 1;
                    arr[row][count] = 9;
                    break;
                }
                else if(arr[row][col] == 2){
                    two = true;
                    arr[row][col] = 9;
                    break;
                }
                else if(arr[1][1] == 2){
                    arr[1][1] = 9;
                    two = true;
                    break;
                }
            }
            if (two) {
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf("%d ",arr[i][k]);
            }
            System.out.println();
        }
        sc.close();
    }
}