package com.example.javaproject2.self_study.treeset;

import java.util.Comparator;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) *-1 ;
    }
}
