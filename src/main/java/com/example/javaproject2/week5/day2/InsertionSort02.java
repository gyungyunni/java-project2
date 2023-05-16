package com.example.javaproject2.week5.day2;

import java.util.Arrays;

//오버로딩 추가
public class InsertionSort02 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if((isAscending ? arr[j-1] - arr[j] : arr[j] - arr[j-1]) > 0) { // 오름차순 : 내림차순
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        InsertionSort02 is = new InsertionSort02();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr = is.sort(arr,false);
        System.out.println(Arrays.toString(arr));
    }
}