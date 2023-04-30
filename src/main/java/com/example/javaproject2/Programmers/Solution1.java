package com.example.javaproject2.Programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/12943
//https://gyun-gyunni.tistory.com/71
class Solution1 {
    public static int solution(long num) {
        int answer = 0;
        while(num != 1) {
            if(num % 2 == 0)
                num /= 2;
            else
                num = num * 3 + 1;
            answer++;

            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int ex = 6;
        System.out.println(solution(ex));
    }
}