package com.example.javaproject2.codeup.codeup1100;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String che = sc.nextLine();

        String[] C1 = che.split("H");
        String temp = C1[0];
        String[] C2 = temp.split("C");

        int cnum = Integer.parseInt(C2[1]);
        int hnum = Integer.parseInt(C1[1]);
        System.out.println(12*cnum + hnum);

    }
}
