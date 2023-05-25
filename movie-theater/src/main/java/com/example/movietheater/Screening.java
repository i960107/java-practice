package com.example.movietheater;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime when;

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    // TODO: 2023/05/18 왜 resreve함수가 customer가 아니라 screening에 있어야할까?
    // screening은 영화를 예매할 책임을 가진다. 영화를 예매하는데 필요한 정보들을 알고 있따.
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(this, customer, calculateFee(audienceCount), audienceCount);
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() {
        return when;
    }
}
