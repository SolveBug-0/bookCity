package com.atguigu.dao;

import com.atguigu.pojo.User;

import java.sql.SQLException;

public interface UserDao {



    /**
     *  根据用户名返回用户信息
     * @param username 用户名
     * @return 如果放回null,说明没用这个用户，反之亦然
     */
    public User queryUserByUsername(String username) throws SQLException;

    /**
     * 根据用户名和密码查询用户
     * @param username 用户名
     * @param password 密码
     * @return  如果返回null说明用户名或密码查询不到
     */
    public User queryUserByUsernameAndPassword(String username,String password) throws SQLException;

    /**
     * 保存用户信息
     * @param user 用户名
     * @return
     */
    public int saveUser(User user) throws SQLException;

}
