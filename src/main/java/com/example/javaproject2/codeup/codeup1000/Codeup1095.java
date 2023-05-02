package com.example.javaproject2.codeup.codeup1000;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] num1 = new int[num];
        for(int i = 0; i < num; i++) {
            num1[i] = sc.nextInt();
        }

        Arrays.sort(num1);
        System.out.println(num1[0]);

    }
}
