package com.example.javaproject2.self_study.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("제이팍");
        treeSet.add("손흥민");
        treeSet.add("bts");
        treeSet.add("봉준호");

        for(String str : treeSet) {
            System.out.println(str);
        }
    }
}
