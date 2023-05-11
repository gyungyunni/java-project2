package com.example.javaproject2.programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/181923
// https://gyun-gyunni.tistory.com/77
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution8 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int value = queries[i][2];
            list.clear();
            for (int j = start; j <= end; j++) {
                if (arr[j] > value) {
                    list.add(arr[j]);
                }
            }
            if (list.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = Collections.min(list);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}

