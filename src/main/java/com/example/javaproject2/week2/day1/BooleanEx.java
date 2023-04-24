package com.example.javaproject2.week2.day1;

public class BooleanEx {
    static int age = 37;
    boolean isAdult() { // isAdult라는 메소드
        return age >= 18;
    }
    public static void main(String[] args) {
        boolean isBalanceSufficient = true; //밸런스-잔액: 잔액이 충분한지?
        boolean result1 = 1 == 1;
        System.out.println(result1);

        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult);
    }
}
