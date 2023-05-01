package com.example.javaproject2.Programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181930
public class Solution3 {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c){
            answer = a + b + c;
        }

        else if (a == b && a == c && b == c) {
            answer = (a + b + c) * (a*a + b*b + c*c)  * (a*a*a + b*b*b + c*c*c);
        }

        else{
            answer = (a + b + c) * (a*a + b*b + c*c);
        }
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(5,3,3));
    }
}
