package com.practice.gamelevel;

public class BeginnerLevel extends PlayerLevel {
    public BeginnerLevel() {
        this.level = "초급자";
        showLevelMessage();
    }

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("jump 못하지롱");
    }

    @Override
    void turn() {
        System.out.println("turn 못하지롱");
    }

}
