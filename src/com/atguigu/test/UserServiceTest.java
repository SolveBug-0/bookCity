package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() throws SQLException {
        userService.registUser(new User(null,"CCaichicao","666666","CCaichicao@qq.com"));
        userService.registUser(new User(null,"BBaichicao","666666","BBaichicao@qq.com"));
        userService.registUser(new User(null,"AAaichicao","666666","AAaichicao@qq.com"));
    }

    @Test
    public void login() throws SQLException {
        System.out.println(userService.login(new User(null,"EEBoy","666666",null)));
        System.out.println(userService.login(new User(null,"AAaichicao","666666",null)));
    }

    @Test
    public void existsUsername() throws SQLException {
        if(userService.existsUsername("admin")){
            System.out.println("用户名已存在！");
        }else{
            System.out.println("用户名不存在！");
        }
    }
}