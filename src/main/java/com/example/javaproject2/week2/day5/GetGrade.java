package com.example.javaproject2.week2.day5;

public class GetGrade {
    public static void main(String[] args) {
        int score = 81;
        if (score >= 90) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 70) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
