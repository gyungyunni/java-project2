package com.example.javaproject2.week5.day4;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets1 = "(((()()))())";

        while(brackets1.indexOf("()") != -1){
            String[] split = brackets1.split("\\(\\)");
            System.out.println(Arrays.toString(split));
            brackets1 = String.join("", split); //연결하기
            System.out.println(brackets1);
        }

    }
}