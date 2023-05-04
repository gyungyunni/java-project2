package com.example.javaproject2.Programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/12931
import java.util.*;

public class Solution10 {
    public static int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 123;
        System.out.println(solution(N));
    }
}