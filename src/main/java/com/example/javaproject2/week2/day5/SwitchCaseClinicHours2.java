package com.example.javaproject2.week2.day5;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "공휴일";
        String time = "휴진";
        switch(day) {
            case "월", "화","수", "목", "금": time = "08:30-20:30"; break;
            case "토": time = "09:00-15:00"; break;
            case "공휴일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}