package com.example.javaproject2.week1.day4;

import com.example.javaproject2.week1.day2.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0; //초기화
        PrintHello printHello;
        printHello = new PrintHello(); // 초기화
        System.out.println(iVal);
        printHello.print();
    }
}
