package com.practice.user.domain.dao.oracle;

import com.practice.user.domain.User;
import com.practice.user.domain.dao.UserDaoStrategy;

public class OracleDaoStrategy implements UserDaoStrategy {
    @Override
    public void insert(User userInfo) {
        String message = String.format("Insert into Oracle DB userID = %s", userInfo.getUserId());
        System.out.println(message);
    }

    @Override
    public void update(User userInfo) {
        String message = String.format("update into Oracle DB userID = %s", userInfo.getUserId());
        System.out.println(message);
    }

    @Override
    public void delete(String userId) {
        String message = String.format("delete from Oracle DB userID = %s", userId);
        System.out.println(message);
    }
}
