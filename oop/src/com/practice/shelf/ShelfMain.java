package com.practice.shelf;

public class ShelfMain {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enqueue("토지1");
        bookQueue.enqueue("토지2");
        bookQueue.enqueue("토지3");
        bookQueue.enqueue("토지4");
        System.out.println(bookQueue.getSize());
        // 리스트를 순회하는 중에 리스트가 변경되는 경우.
//        for (String book : bookShelf.getShelf()) {
//            System.out.println(bookQueue.dequeue());
//        }
        System.out.println(((BookShelf) bookQueue).getShelf());
    }
}
