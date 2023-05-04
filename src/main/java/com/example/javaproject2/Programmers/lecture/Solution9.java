package com.example.javaproject2.Programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/181922
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution9 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];

            for (int j = start; j <= end; j++) {
                if (j % value == 0 || j == 0) {
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}

