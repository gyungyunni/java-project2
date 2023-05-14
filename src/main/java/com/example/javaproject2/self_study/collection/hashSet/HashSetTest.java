package com.example.javaproject2.self_study.collection.hashSet;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("아이언맨"));
        hashSet.add(new String("캡틴아메리카"));
        hashSet.add(new String("헐크"));
        hashSet.add(new String("토르"));
        hashSet.add(new String("토르"));

        System.out.println(hashSet);
    }
}
