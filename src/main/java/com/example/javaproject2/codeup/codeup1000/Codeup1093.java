package com.example.javaproject2.codeup.codeup1000;

import java.io.*;
import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ans = new int[24];
        int[] num1 = new int[num];
        for(int i = 0; i < num; i++) {
            num1[i] = sc.nextInt();
            ans[num1[i]] +=1;
        }
        for(int i = 1; i < 24; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
