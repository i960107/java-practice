package com.example.movietheater;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        // TODO: 2023/05/18 how can make code more readable? (done)
        // TODO: 왜 이건 screening에 물어보지 않지.
        if (screening.getWhen().getDayOfWeek().equals(dayOfWeek)) {
            return false;
        }
        //local date time에서 time만 가져오는 법 -> toLocalTime()
        if (startTime.compareTo(screening.getStartTime().toLocalTime()) > 0) {
            return false;
        }

        if (endTime.compareTo(screening.getStartTime().toLocalTime()) < 0) {
            return false;
        }

        return true;
    }
}
