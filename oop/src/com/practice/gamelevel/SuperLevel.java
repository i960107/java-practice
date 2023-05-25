package com.practice.gamelevel;

public class SuperLevel extends PlayerLevel {
    public SuperLevel() {
        this.level = "고급자";
        showLevelMessage();
    }

    @Override
    void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("turn 합니다.");
    }


}
