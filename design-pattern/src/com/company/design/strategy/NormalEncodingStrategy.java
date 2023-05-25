package com.company.design.strategy;

public class NormalEncodingStrategy implements EncodingStrategy {
    @Override
    public String encode(String message) {
        return message;
    }
}
