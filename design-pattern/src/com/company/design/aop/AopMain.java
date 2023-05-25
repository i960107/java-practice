package com.company.design.aop;

import java.util.concurrent.atomic.AtomicLong;

public class AopMain {
    public static void main(String[] args) {
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        AopBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    System.out.println("after");
                    end.set(System.currentTimeMillis() - start.get());
                }
        );
        aopBrowser.show();
        System.out.println("loading time:" + end.get());
        aopBrowser.show();
        System.out.println("loading time:" + end.get());
        aopBrowser.show();
    }
}
