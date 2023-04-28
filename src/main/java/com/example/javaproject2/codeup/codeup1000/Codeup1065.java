package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1065 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0)
                System.out.println(array[i]);
        }
    }
}

