package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1087 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i <= num; i ++){
            sum += i;
            if(sum >= num){
                System.out.println(sum);
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
