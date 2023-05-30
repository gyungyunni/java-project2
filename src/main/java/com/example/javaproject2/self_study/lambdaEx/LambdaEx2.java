package com.example.javaproject2.self_study.lambdaEx;

@FunctionalInterface
interface MyFunction2 {
    public abstract int max(int a,int b);
}
public class LambdaEx2 {
    public static void main(String[] args) {

        MyFunction2 f = (a, b) -> a > b ? a : b;
        int value = f.max(3,5);
        System.out.println("value = " + value);
    }
}
