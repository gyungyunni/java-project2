package com.example.javaproject2.week8.day3;

public class Main {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("usage: add, commit");
            return;
        }

        String command = args[0];

        if(command.equals("add")) {
            System.out.println("add changes to git: ");
            for (int i = 1; i < args.length; i++) {
                System.out.println(args[i]);
            }
        } else if(command.equals("commit")) {

            if(args[2] != null) {
                System.out.println("commit with message: \"" + args[2] + "\"");
                System.out.println(args[2]);
            }
            else {
                System.out.println("no message specified");
            }
        }
    }
}
