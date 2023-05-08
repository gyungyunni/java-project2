package com.example.javaproject2.codeup.codeup1200;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// buffer로 푸는 법
/*
public class StairsStar {
    public static void main(String[] args) throws IOException {
        int height = 5;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) bw.append(" ");
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}
*/