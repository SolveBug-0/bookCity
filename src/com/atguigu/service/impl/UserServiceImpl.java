package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;

import java.sql.SQLException;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/4/23 15:22
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();


    @Override
    public void registUser(User user) throws SQLException {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) throws SQLException {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) throws SQLException {
        if(userDao.queryUserByUsername(username) == null){
            return false;
        }else{
            return true;
        }
    }
}
