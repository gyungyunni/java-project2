package com.example.javaproject2.week4.day4;

public class UserTest {
    public static void main(String[] args) {
        User user1  = new User();
        user1.setName("김민균");
        user1.setAge(26);

        User user2 = new User();
        user2.setName("아무개");
        user2.setAge(28);

        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
    }
}
