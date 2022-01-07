package com.management.dao;

import com.management.BaseTest;
import com.management.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void testQueryId(){
        long id=1;
        User user=userDao.queryById(id);
        System.out.println(user.getUserSex());
    }
    @Test
    public void testAddUser(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String createtime=dateTime.format(formatter);
        User user=new User();
        user.setUserNo("11");
        user.setUserSex("1");
        user.setUserName("stonee");
        user.setCreateTime(createtime);
        user.setUpdateTime(createtime);
        user.setDelete(false);
        int num=userDao.addUser(user);
        System.out.println(num);
    }

}
