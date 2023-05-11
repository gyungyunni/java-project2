package com.example.javaproject2.programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/181924

import java.util.Arrays;

public class Solution5 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i =0; i < queries.length; i++)
            for(int j =0; j < 1; j++)
                swap(arr, queries[i][j],queries[i][j+1] );

        return answer;
    }

    private static void swap(int[] arr, int i, int j) {
        int[] temp = new int[1];
        temp[0] = arr[j];
        arr[j] = arr[i];
        arr[i] = temp[0];
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}

