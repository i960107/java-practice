package com.practice.user.domain.dao;

import com.practice.user.domain.User;

public interface UserDaoStrategy {
    void insert(User user);

    void update(User user);

    void delete(String userId);
}
