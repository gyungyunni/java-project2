package com.example.javaproject2.week4.day3practice.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMessage(String message){
        return encodingStrategy.encoding(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy){
        this.encodingStrategy = encodingStrategy;
    }
}