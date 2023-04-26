package com.example.javaproject2.week2.day3;

import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0]; // 0번에 있는 값 저장
        arr[0] = arr[1]; // 0번 방에 덮어 쓰기
        arr[1] = temp; // 임시로 저장한 값을 1번에 넣기
        System.out.println(Arrays.toString(arr));
    }
}