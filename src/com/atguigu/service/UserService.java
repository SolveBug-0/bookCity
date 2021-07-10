package com.atguigu.service;

import com.atguigu.pojo.User;

import java.sql.SQLException;

public interface UserService {
    /**
     * 注册用户
     * @param user 用户名
     */
    public void registUser(User user) throws SQLException;

    /**
     * 登录
     * @param user 用户名
     * @return 如果返回null说明登录失败，有值着登录成功
     */
    public User login(User user) throws SQLException;

    /**
     * 检查数据表中是否有相同的名字
     * @param username 输入的用户名
     * @return 返回true表示已存在，返回false表示不存哎
     */
    public boolean existsUsername(String username) throws SQLException;

}