package com.atguigu.test;

import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/4/21 21:00
 */
public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        for(int i = 0;i<100;i++){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }
}
