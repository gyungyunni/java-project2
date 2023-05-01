//https://school.programmers.co.kr/learn/courses/30/lessons/138477
// https://gyun-gyunni.tistory.com/72
package com.example.javaproject2.Programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution2 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(temp.size() < k) {
                temp.add(score[i]);
                Collections.sort(temp);
                answer[i] = temp.get(0);
                continue;
            }

            if(temp.size() == k) {
                int min = temp.get(0);
                if(min < score[i]) {
                    temp.remove(0);
                    temp.add(score[i]);
                    Collections.sort(temp);
                }
                answer[i] = temp.get(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10,100,20,150,1,100,200};
        System.out.println(Arrays.toString(solution(k, score)));
    }
}
