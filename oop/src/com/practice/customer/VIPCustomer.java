package com.practice.customer;

public class VIPCustomer extends Customer {
    private int agentId;
    private double salesRatio;

    public VIPCustomer(int id, String name) {
        super(id, name, "VIP", 0.05);
//        System.out.println("vip customer constructor");
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }

    private int getAgentId() {
        return agentId;
    }

    private void setAgentId(int agentId) {
        this.agentId = agentId;
    }
}
