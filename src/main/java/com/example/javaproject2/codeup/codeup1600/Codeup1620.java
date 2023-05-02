package com.example.javaproject2.codeup.codeup1600;

import java.util.Scanner;

public class Codeup1620 {

    public static int pro(int num){
        int value = num;
        int sum = 0;
        while (true) {
            if (value == 0) {
                break;
            }
            sum += (value % 10);
            value /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while (true) {
            if (num < 10) {
                break;
            }
            num = pro(num);
        }
        System.out.println(num);
        sc.close();

    }
}
