package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String hbcs[] = br.readLine().split(" ");
        float h = Integer.parseInt(hbcs[0]);
        float b = Integer.parseInt(hbcs[1]);
        float c = Integer.parseInt(hbcs[2]);
        float s = Integer.parseInt(hbcs[3]);
        float bit = h * b * c * s;
        float byte1 = bit/8;
        float kb = byte1 / 1024;
        float mb = kb / 1024;

        System.out.printf("%.1f MB\n",mb);

        bw.flush();
        bw.close();
        br.close();
    }
}
