package com.example.movietheater;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
