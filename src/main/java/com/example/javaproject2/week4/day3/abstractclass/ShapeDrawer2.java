package com.example.javaproject2.week4.day3.abstractclass;

public abstract class ShapeDrawer2 {

    protected String symbol; // private로 하면 자식클래스에서 접근x

    public ShapeDrawer2(String symbol) {
        this.symbol = symbol;
    }
}

