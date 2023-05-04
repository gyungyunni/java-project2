package com.example.javaproject2.Programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

public class Solution11 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 12;
        System.out.println(solution(N));
    }
}