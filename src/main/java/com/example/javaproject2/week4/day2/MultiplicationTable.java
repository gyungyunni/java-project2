package com.example.javaproject2.week4.day2;

public class MultiplicationTable {
    // x
    public static void printDan(String multipleSymbol, int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        // 2, 5, 7, 8
        printDan("*", 2);
        printDan("x", 5);
        printDan("X", 7);
        printDan("x", 8);
    }
}
