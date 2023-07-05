package com.example.javaproject2;

import java.util.Optional;

public class Main {
    public static String nullableMethod(){ //Optional 대신 이렇게 해도 이상한건 아님
        return null;
    }
    public static void main(String[] args) {

        /*
        String result = nullableMethod();
        result.toString(); //Cannot invoke "java.lang.Integer.toString()" because "result" is null
         */

        //Optional
        Optional<String> optionalValue = Optional.ofNullable(null); //null인지 null이 아니든지 Optional 객체로 할당됨
                                                                          //할당이 된 후, null인지 아닌지 검사를 함

        if (optionalValue.isPresent()) {  // 데이터를 가지고 있을 때
            System.out.println("Value is present: " + optionalValue.get());
        } else {  // 데이터가 존재하지 않을 때
            System.out.println("Value is not present");
        }

        //Optional<T>.orElse(T other) : 데이터가 없을때 other를 대신 사용
        System.out.println("Value is: " + optionalValue.orElse("null"));
    }
}
