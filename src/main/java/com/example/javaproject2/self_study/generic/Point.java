package com.example.javaproject2.self_study.generic;

public class Point<T, V> {

    private T x;
    private V y;

    Point(T x, V y){
        this.x = x;
        this.y = y;
    }

    public  T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
