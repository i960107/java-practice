package com.company.design.strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public Encoder() {
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public String encode(String message) {
        return encodingStrategy.encode(message);
    }
}
