package com.practice.user.domain.dao.mysql;

import com.practice.user.domain.User;
import com.practice.user.domain.dao.UserDaoStrategy;

public class MysqlDaoStrategy implements UserDaoStrategy {
    @Override
    public void insert(User userInfo) {
        String message = String.format("Insert into MySql DB userID = %s", userInfo.getUserId());
        System.out.println(message);
    }

    @Override
    public void update(User userInfo) {
        String message = String.format("update into MySql DB userID = %s", userInfo.getUserId());
        System.out.println(message);
    }

    @Override
    public void delete(String userId) {
        String message = String.format("delete from MySql DB userID = %s", userId);
        System.out.println(message);
    }
}
