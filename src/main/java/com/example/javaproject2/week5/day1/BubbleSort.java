package com.example.javaproject2.week5.day1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/* 개선점 : 정렬이 실행될 때마다 가장 큰 요소는 제외시키기
public class BubbleSort {
   public static void main(String[] args) {
       int[] arr = {7, 2, 3, 9, 28, 1};

       for (int j = 1; j <= arr.length; j++) {
           for (int i = 0; i < arr.length - j; i++) {
               if (arr[i] > arr[i + 1]) {
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
   }
}
 */