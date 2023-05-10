package com.example.javaproject2.week4.day3practice.strategy;

public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encoding(String message) {
        return "ABCD" + message;
    }
}
