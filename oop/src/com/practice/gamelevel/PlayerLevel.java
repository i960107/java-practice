package com.practice.gamelevel;

public abstract class PlayerLevel {
    String level;

    public String getLevel() {
        return level;
    }

    abstract void run();

    abstract void jump();

    abstract void turn();

    public final void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

    public void showLevelMessage() {
        System.out.println(String.format("***********%s 레벨입니다.********", level));
    }
}
