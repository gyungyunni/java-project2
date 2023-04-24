package com.example.javaproject2.week2.day1;

public class FloatDigit {
    public static void main(String[] args) {
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10); //F10 에선 예상과 다른 결과 발생
                                            //F10 같은 경우는 float이 아니라 double에 담아서 원하는 결과값을 받아낼 수 있다
        System.out.println("d10 = " + d10);

        float f1 = 3.141592653589793f;
        System.out.println(f1); //반올림

    }
}
