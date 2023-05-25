package com.example.movietheater;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // TODO: 2023/05/18 객체에게 원하는 것을 요청해야함. 
    @Override
    public boolean isSatisfiedBy(Screening screening) {
//        return screening.getSequence() == sequence;
        return screening.isSequence(sequence);
    }
}
