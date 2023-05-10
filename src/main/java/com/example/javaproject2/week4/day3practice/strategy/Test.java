package com.example.javaproject2.week4.day3practice.strategy;

public class Test {
    public static void main(String[] args) {
        //인코더 객체
        Encoder encoder = new Encoder();

        // base64 전략
        EncodingStrategy base64 = new Base64Strategy();

        // normal 전략
        EncodingStrategy normal = new NormalStrategy();

        String message = "mutsa";

        //base64 인코딩
        encoder.setEncodingStrategy(base64); // 사용할때마다 전략 셋팅, 인코더에 base64 주입
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        //normal 인코딩
        encoder.setEncodingStrategy(normal); // 사용할때마다 전략 셋팅, 인코더에 normal 주입
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
}