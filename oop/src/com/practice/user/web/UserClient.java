package com.practice.user.web;

import com.practice.user.domain.User;
import com.practice.user.domain.dao.UserDao;
import com.practice.user.domain.dao.mysql.MysqlDaoStrategy;
import com.practice.user.domain.dao.oracle.OracleDaoStrategy;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        User user = new User("kim12", "1234", "kim");

        UserDao dao = null;
        if (dbType.equals("MYSQL")) {
            dao = new UserDao(new MysqlDaoStrategy());
        } else if (dbType.equals("ORACLE")) {
            dao = new UserDao(new OracleDaoStrategy());
        } else {
            System.out.println("db type not supported ");
        }

        if (dao != null) {
            dao.insert(user);
            dao.update(user);
            dao.delete(user);
        }
    }
}
