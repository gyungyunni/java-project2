package com.example.javaproject2.week4.day3.morning;

public class RightTriangleDraw extends ShapeDrawer2 {

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "0".repeat(h - i), "*".repeat(i));
    }

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf("%s", makeALine(height, i));
        }
    }
    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw();
        rtd.printShape(5);
    }
}