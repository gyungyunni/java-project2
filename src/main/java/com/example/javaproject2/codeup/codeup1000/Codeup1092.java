package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1092 {
     public static void pro(int a, int b, int c){
        int day = 1;
        while(day % a != 0 || day % b != 0 || day % c != 0)
            day++;
        System.out.println(day);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String abc[] = br.readLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);
        pro(a,b,c);
        bw.flush();
        bw.close();
        br.close();


    }
}
