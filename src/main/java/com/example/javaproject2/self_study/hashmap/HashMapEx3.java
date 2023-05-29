package com.example.javaproject2.self_study.hashmap;
import java.util.*;
class HashMapEx3 {
    public static void main(String[] args) {

        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        HashMap map = new HashMap();

        //A가 몇개인지 K가 몇개인지를 알 수 있음. 단어 카운팅 체크
        for(int i=0; i < data.length; i++) {
            if(map.containsKey(data[i])) {
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                map.put(data[i], new Integer(1));
            }
        }

        // 원하는 모양으로 출력하기 위한 코드
        // printBar라는 메서드를 활용
        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
    } // main

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar); 	// String(char[] chArr)
    }
}