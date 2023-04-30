package com.example.javaproject2.codeup.codeup1000;

<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> Codeup_1000
import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        char input = sc.next().charAt(0);
        int num = (int)input - 96;  // 아스키 코드 a = 97   num = 문자 개수   + A = 65
        System.out.println(num); // 배열 크기  ex) f = a,b,c,d,e,f
        char [] arr = new char[num];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            arr[num-1] = input;
            num --;
            input --;

        }
        System.out.println(Arrays.toString(arr)); // 배열 출력

    }
}
=======
        String str = sc.next();
        char alp = str.charAt(0);
        for(int i = 97; i <= (int)alp; i++) {
            System.out.printf("%c ", i);
        }
    }
}
>>>>>>> Codeup_1000
