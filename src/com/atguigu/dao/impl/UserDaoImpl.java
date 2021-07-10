package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;
import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.SQLException;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/4/22 20:03
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) throws SQLException {
        String sql = "Select * From t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) throws SQLException {
        String sql = "Select * From t_user Where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) throws SQLException {
        String sql = "Insert into t_user(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
