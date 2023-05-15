package com.example.javaproject2.week5.day1.algorithm;

import java.util.Arrays;

public class BubbleSortOOP {

    public int[] sortARound(int[] arr, int until){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            arr = sortARound(arr, arr.length - j);
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSortOOP bubbleSortoop = new BubbleSortOOP();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSortoop.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

