package com.example.javaproject2.week2.day4;

import java.util.Arrays;

public class ComparisonArrary {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 9};
        System.out.printf("%d > %d --> %b\n",arr[0],arr[1], arr[0]>arr[1]);
        int temp = arr[0]; // arr[0]에 있는 값을 임시 저장
        arr[0] = arr[1]; // arr[0]에 arr[1]값을 덮어 씀 1, 1 상태가 됨
        arr[1] = temp; // arr[1]에 임시 저장한 값을 저장 1, 2 상태가 됨
        System.out.printf(Arrays.toString(arr)+"\n");
        System.out.printf("%d > %d = %b\n", arr[1], arr[2], arr[1] > arr[2]);
        System.out.printf("%d > %d = %b\n", arr[2], arr[3], arr[2] > arr[3]);
    }
}
