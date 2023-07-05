package com.example.javaproject2.algorithm.string;

public class IntegerToAlpha {
    public static String IntegerToAlpha(int value) {
        StringBuilder answerBuilder = new StringBuilder();
        //음수인지를 판별하기 위한 boolean isNegetive 변수
        boolean isNegetive = false;

        //음수라면 양수로 바꿔주고 isNegetive를 true로.
        if (value < 0) {
            value *= -1;
            isNegetive = true;
        }

        //10으로 나눈 나머지와 10으로 나눈 몫을 활용하여 answerBuilder에 붙임.
        while (value != 0) {
            char digitChar = (char) (value % 10 + '0');
            answerBuilder.append(digitChar);
            value /= 10;
        }

        //음수라면 - 기호 붙여주기
        if (isNegetive) answerBuilder.append('-');

        //역순으로 바꿔준 후 리턴.
        return answerBuilder.reverse().toString();
    }
}
