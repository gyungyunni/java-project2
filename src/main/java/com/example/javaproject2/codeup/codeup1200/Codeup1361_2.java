package com.example.javaproject2.codeup.codeup1200;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// buffer로 푸는 법
public class Codeup1361_2 {
    public static void main(String[] args) throws IOException {
        int height = 5;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                bw.append(" ");
            }
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}

