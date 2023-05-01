package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1091 {
    public static void pro(long a, int b,int c,int n){
        long num = a * b + c;
        if(n==0)
            System.out.println(a);
        if(n==1)
            System.out.println(num);
        if(n>1) {
            pro(num, b, c, n - 1);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String amdn[] = br.readLine().split(" ");
        long a_num = Integer.parseInt(amdn[0]);
        int m_num = Integer.parseInt(amdn[1]);
        int diff = Integer.parseInt(amdn[2]);
        int num = Integer.parseInt(amdn[3]);
        pro(a_num, m_num, diff, num-1);

        bw.flush();
        bw.close();
        br.close();
    }
}
