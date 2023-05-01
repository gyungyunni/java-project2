package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1088 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i ++){
            if(i % 3 ==0)
                continue;
            else
                System.out.println(i);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
