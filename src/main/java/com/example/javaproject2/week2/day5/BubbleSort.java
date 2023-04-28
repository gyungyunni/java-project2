//Codeup 1441
package com.example.javaproject2.week2.day5;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[10001];
        int n, i, j, temp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 1; i <= n; i++)
            a[i] = sc.nextInt();

        for (i = 1; i < n; i++) {
            // 이 부분에 들어가야 될 코드를 작성하여 제출
            for (j = 1; j < n; j++)
            {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (i = 1; i <= n; i++)
            System.out.printf("%d\n", a[i]);
    }
}