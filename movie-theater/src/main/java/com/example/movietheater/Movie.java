package com.example.movietheater;

public class Movie {
    // TODO: 2023/05/18 영화와 상영은 has-a? is-a. decorator pattern or extends?
    // 영화와 상영은 포함관계가 되어야한다. movie와 screening은 interface를 공유하지 않는다.
    private String title;
    private int runnigTime;
    private Money fee;
    // TODO: 2023/05/18 영화에 discount condition/ policy적용. condition에서는 Screening필요. policy에서는 Movie필요.
    // Screening에서 Movie에 calculateMovieFee라는 메시지를 전송하면서 screening 객체를 넘긴다. -> movie가 기본 요금과 할인 정채긍ㄹ 제일 잘 알고 있음.
    // 외부에서는 movie는 알 수 없고 screening에만 의존해야 함.
//    private List<DiscountCondition> conditions;
    private DiscountPolicy discountPolicy;

    public Movie(String title, int runnigTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runnigTime = runnigTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    // TODO: 2023/05/18 discount conditoin을 확인하고 넘어옴..? 어떻게 알 수 있지.
    // discount condition은 discount policy에 포함됨.
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
