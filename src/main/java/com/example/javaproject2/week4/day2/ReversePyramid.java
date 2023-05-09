package com.example.javaproject2.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    String spaceChar;
    public ReversePyramid(String spaceChar){
        this.spaceChar = spaceChar;
    }
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h *2 -1 - (i * 2)));
    }
    public String makeAParallelLine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid("0");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(reversePyramid.makeAParallelLine(h, i));
        }
    }
}

