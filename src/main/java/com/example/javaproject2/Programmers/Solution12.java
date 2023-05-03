package com.example.javaproject2.Programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/12928

import java.util.ArrayList;
import java.util.Arrays;

public class Solution12 {
    public static boolean isPrime(int n) {
        int factors = 0;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        return factors == 0 ? true : false;
    }
    public static int[] solution(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i)) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int N = 1221;
        System.out.println(Arrays.toString(solution(N)));
    }
}