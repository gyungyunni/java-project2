package com.example.javaproject2.codeup.codeup1000;

import java.io.*;

public class Codeup1089 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String adn[] = br.readLine().split(" ");
        int a_num = Integer.parseInt(adn[0]);
        int diff = Integer.parseInt(adn[1]);
        int num = Integer.parseInt(adn[2]);

        System.out.println(a_num + diff * (num-1));

        bw.flush();
        bw.close();
        br.close();
    }
}
