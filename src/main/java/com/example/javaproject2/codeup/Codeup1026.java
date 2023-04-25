package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split(":");
        int min = Integer.parseInt(num[1]);
        System.out.printf("%1d",min);

    }

}