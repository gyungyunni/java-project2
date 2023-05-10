package com.example.javaproject2.week4.day3.abstractclass;

public class DiamondShapeDrawer2 extends ShapeDrawer2{
    public DiamondShapeDrawer2(String symbol) {
        super(symbol);
    }
    public static void main(String[] args) {
        DiamondShapeDrawer2 diamondShapeDrawer2 = new DiamondShapeDrawer2("*");
    }
}