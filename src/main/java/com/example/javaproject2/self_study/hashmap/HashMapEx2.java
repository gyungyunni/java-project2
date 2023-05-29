package com.example.javaproject2.self_study.hashmap;

import java.util.*;
class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        // 5개를 put 했는데 4개만 저장됨
        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        // map 데이터를 set으로 저장해서 읽어오는 법
        // entrySet으로 가져오면 저장이 key-value set으로 저장됨
        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        // 이름만 가져오고 싶으면 keyset으로 가져오기
        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        // 값들만 가져올 수도 있음
        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size()); //float안하면 정수로 출력됨
        System.out.println("최고점수 : " + Collections.max(values)); //comparable을 구현한 클래스의 객체만 values로 들어갈 수 있음
        System.out.println("최저점수 : " + Collections.min(values));
    }
}