package com.example.javaproject2.Programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181833

public class Solution7 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if(i == j){
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(solution(n)));
    }
}
