package com.example.movietheater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    // TODO: 2023/05/18 Discount Policy가 DiscountConditon을 가진다
    private List<DiscountCondition> discountConditionList;

    public DiscountPolicy(DiscountCondition... conditions) {
        discountConditionList = new ArrayList<>();
        this.discountConditionList = Arrays.asList(conditions);
    }

    //template method pattern
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : discountConditionList) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);

}
