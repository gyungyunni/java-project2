package com.example.javaproject2.week1.day3;

import java.io.IOException;
import java.io.InputStreamReader;
public class JavaInput {
    public void readAChar() throws IOException {
        // InputStreamReader라는 클래스를 is라는 이름으로 선언
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());

    }
    public void readTwoChars() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();

        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}


