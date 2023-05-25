package com.example.movietheater;

public class Reservation {
    private Screening screening;
    private Customer customer;
    // TODO: 2023/05/18 original price나 ticket 각 각의 값은 저장할 필요 없을까?
    private Money fee;
    private int audienceCount;

    public Reservation(Screening screening, Customer customer, Money fee, int audienceCount) {
        this.screening = screening;
        this.customer = customer;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
