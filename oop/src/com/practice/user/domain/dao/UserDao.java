package com.practice.user.domain.dao;

import com.practice.user.domain.User;

public class UserDao {
    private final UserDaoStrategy strategy;

    public UserDao(UserDaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void insert(User user) {
        strategy.insert(user);
    }

    public void update(User user) {
        strategy.update(user);
    }

    public void delete(User user) {
        strategy.delete(user.getUserId());
    }


}
