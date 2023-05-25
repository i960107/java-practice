package com.company.design.observer;

public class Button {
    private String name;
    // observer들 .list가 될 수 있음.
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void addListener(IButtonListener buttonListener){
        this.buttonListener = buttonListener;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }
}
