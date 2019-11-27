package com.service;

import com.dao.UserDao;
import com.entity.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserInfo getUserById(int id){
        UserInfo userById = userDao.getUserById(id);
        return userById;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
