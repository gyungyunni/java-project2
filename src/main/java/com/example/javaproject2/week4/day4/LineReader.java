package com.example.javaproject2.week4.day4;

import java.util.List;
//getLines 추상화 위한 LineReader 인터페이스
public interface LineReader {
    List<String> getLines(String fileName);
}