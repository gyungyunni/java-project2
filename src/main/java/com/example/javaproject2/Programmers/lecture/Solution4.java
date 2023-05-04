package com.example.javaproject2.Programmers.lecture;
// https://school.programmers.co.kr/learn/courses/30/lessons/181928
import java.util.Arrays;

public class Solution4 {
    public static int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;

        for(int i = 0;i < num_list.length;i++){
            if(num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            }
            else {
                odd *= 10;
                odd += num_list[i];
            }
        }
        answer = even + odd;
        return answer;
    }
    /*
      public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd= "";
        for ( int i = 0; i < num_list.length; i++ ) {
            if ( num_list[i] % 2 == 1 ) {
                odd += num_list[i];
            } else even += num_list[i];
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}
     */

    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}

