package com.example.javaproject2.week4.day3.morning;

public class DrawDiamondFor {
    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;

        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
                for (int j = 0; j < -2 + h - i - 2; j++) {
                    System.out.print(" "); // 공백
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*"); // 피라미드
                }
            } else {
                for (int j = 0; j < i - pivot; j++) {
                    System.out.print(" "); // 공백
                }
                for (int j = 0; j < 2 * (h - i) - 1; j++) {
                    System.out.print("*"); // 피라미드
                }
            }
            System.out.println();
        }
    }
}