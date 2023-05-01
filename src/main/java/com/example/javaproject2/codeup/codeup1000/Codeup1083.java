package com.example.javaproject2.codeup.codeup1000;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        String answer = "X";
        for (int i = 1; i <=data; i++){
                if(i % 3 == 0)
                    System.out.printf("%S ",answer);
                else
                    System.out.print(i+" ");
            }
        }
    }
