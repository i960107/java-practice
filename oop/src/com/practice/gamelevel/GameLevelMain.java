package com.practice.gamelevel;

public class GameLevelMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);
    }
}
