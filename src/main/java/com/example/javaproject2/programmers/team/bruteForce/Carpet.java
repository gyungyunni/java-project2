package com.example.javaproject2.programmers.team.bruteForce;

import java.util.Arrays;

import static java.lang.Math.sqrt;

class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int width = 0, depth = 0;

        boolean check = false;

        for (int i = 3 ; i <= sqrt(sum); i++) { //sqrt(sum)을 한 이유는
                                                // depth는 sqrt(sum) 이하이기 때문에 불필요한 연산 줄이기
            if(sum % i == 0 ){
                depth = i;
                width = sum/i;
                if( yellow == (depth - 2 ) * (width - 2)){ // 이 조건까지 만족하면 도중에 for문 끝남
                    check = true;
                }
            }
            if(check){
                answer[0] = width;
                answer[1] = depth;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(solution(brown,yellow)));
    }
}