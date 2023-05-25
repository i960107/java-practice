package com.practice.shelf;

public interface Queue {
    void enqueue(String title);
    String dequeue();

    int getSize();
}
