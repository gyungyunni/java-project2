// https://gyun-gyunni.tistory.com/70 자세한 풀이는 티스토리에 올려둠
// [프로그래머스 / 1차] 비밀지도
package com.example.javaproject2.Programmers;
import java.util.Arrays;

class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]); // Integer.toBinaryString은 return : String
            System.out.println((Object)result[i].getClass().getSimpleName());
        }
        for (int i = 0; i < n; i++) {
            //5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            result[i] = String.format("%" + n + "s", result[i]);

            // 1 -> #, 0 -> " "
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
    }
}