package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1086{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String whb[] = br.readLine().split(" ");
        float w = Integer.parseInt(whb[0]);
        float h = Integer.parseInt(whb[1]);
        float b = Integer.parseInt(whb[2]);
        float bit = w * h * b ;
        float byte1 = bit/8;
        float kb = byte1 / 1024;
        float mb = kb / 1024;

        System.out.printf("%.2f MB\n",mb);

        bw.flush();
        bw.close();
        br.close();
    }
}
