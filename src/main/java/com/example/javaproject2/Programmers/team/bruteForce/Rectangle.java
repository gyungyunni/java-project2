package com.example.javaproject2.Programmers.team.bruteForce;

public class Rectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 1; j++) {
                if(sizes[i][j] < sizes[i][j+1]){
                    temp = sizes[i][j];
                    sizes[i][j] = sizes[i][j+1];
                    sizes[i][j+1] = temp;
                }
            }
        }
        int w_max = sizes[0][0];
        int h_max = sizes[0][1];
        for (int i = 1; i < sizes.length; i++) {
            if(sizes[i][0] > w_max) {
                w_max = sizes[i][0];
            }
        }
        for (int i = 1; i < sizes.length; i++) {
            if(sizes[i][1] > h_max) {
                h_max = sizes[i][1];
            }
        }
        answer = w_max * h_max;
        return answer;
    }
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        System.out.println(solution(sizes));
    }
}