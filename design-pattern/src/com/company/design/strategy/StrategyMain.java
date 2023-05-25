package com.company.design.strategy;

public class StrategyMain {
    public static void main(String[] args) {

        Encoder encoder = new Encoder();
        String mesasge = "hello java";

        EncodingStrategy normal = new NormalEncodingStrategy();
        encoder.setEncodingStrategy(normal);
        System.out.println(encoder.encode(mesasge));

        EncodingStrategy base64 = new Base64EncodingStrategy();
        encoder.setEncodingStrategy(base64);
        System.out.println(encoder.encode(mesasge));

        EncodingStrategy append = new AppendStrategy();
        encoder.setEncodingStrategy(append);
        System.out.println(encoder.encode(mesasge));

    }
}
