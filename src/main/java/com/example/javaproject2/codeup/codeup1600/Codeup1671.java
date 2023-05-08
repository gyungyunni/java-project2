package com.example.javaproject2.codeup.codeup1600;

public class Codeup1671 {
    public String play(int user, int computer) {
        // 0바위 1가위 2보
        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }
    public static void main(String[] args) {
        Codeup1671 rpc = new Codeup1671();
        System.out.println(rpc.play(0, 1)); // win
        System.out.println(rpc.play(2, 2)); // tie
        System.out.println(rpc.play(2, 1)); // lose
    }
}