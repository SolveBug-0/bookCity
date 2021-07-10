package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() throws SQLException {
        if(userDao.queryUserByUsername("admin") == null){
            System.out.println("用户名可用！");
        }else{
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() throws SQLException {
        if(userDao.queryUserByUsernameAndPassword("admin","admin ") == null){
            System.out.println("用户名或密码错误！");
        }else{
            System.out.println("查询成功！");
        }
    }

    @Test
    public void saveUser() throws SQLException {
        System.out.println(userDao.saveUser(new User(null,"wzg168","123457","wzg168@qq.com")));
    }
}