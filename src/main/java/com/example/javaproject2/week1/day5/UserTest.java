package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User mk = new User();
        mk.name = "김민균";
        mk.phoneNumber = "010-1111-2222";
        mk.age = 26;

        User iu = new User();
        iu.name = "아이유";
        iu.phoneNumber = "010-2222-2222";
        iu.age = 22;
        System.out.printf("%s님은 성인입니까? %s\n", mk.name, mk.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", iu.name, iu.isAdult());
    }
}
