package com.company.design.strategy;


import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodingStrategy implements EncodingStrategy {
    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes(StandardCharsets.UTF_8));
    }
}
