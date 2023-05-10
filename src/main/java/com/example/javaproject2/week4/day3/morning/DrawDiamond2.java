package com.example.javaproject2.week4.day3.morning;

public class DrawDiamond2 {
    public static String getRepeatSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static String makeALine(int h, int i) {
        int pivot = h / 2;
        if (i <= pivot) {
            return String.format("%s%s\n", getRepeatSymbol("0", -2 + h - i - 2), getRepeatSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatSymbol("0", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        int h = 7;
        DrawDiamond2 drawDiamond2 = new DrawDiamond2();
        for (int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}