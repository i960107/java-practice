package com.practice.scheduler;

import java.io.IOException;

public class SchedulerMain {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담원 할당 방식을 선택하세요.");
        System.out.println("R: 한명씩 차례로");
        System.out.println("L: 대기가 적은 상담원");
        System.out.println("P: 우선순위가 높은 고객 우선 숙련도 높은 상담원");

        //아스키 코드로 받음 next byte를 읽음.
        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R') {
            scheduler = new RoundRobin();
        } else if (ch == 'L') {
            scheduler = new LeastJob();
        } else if (ch == 'P') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("unsupported type");
        }

        if (scheduler != null) {
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }
    }
}
