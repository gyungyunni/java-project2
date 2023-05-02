package com.example.javaproject2.codeup.codeup1000;

import java.io.IOException;
import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[num];
        int[] num1 = new int[num];
        for(int i = 0; i < num; i++) {
            num1[i] = sc.nextInt();
            ans[num-i-1] = num1[i];
        }

        for(int i = 0; i < num; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
