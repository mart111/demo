package com.example.demo;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;
import java.util.List;

@Service
public class UserService {

    @Autowired
    DBConnector dbConnector;

    public boolean validateLogin(String username, String password) {

        try {
            Session session = dbConnector.getSession();
            SQLQuery query = session.createSQLQuery("Select * from users_table " +
                    "where username='" + username + "'" + " and password='" + password + "'");
            List<User> userList = query.list();

            return userList.size() == 1;
        } catch (ConstraintViolationException e) {

        }

        return false;
    }

    public void add(User user) {

        dbConnector.add(user);
    }
}
