package com.atguigu.dao.impl;

import com.atguigu.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/4/21 21:16
 */
public abstract class BaseDao {

    //使用JdbcUtils连接数据库
    QueryRunner queryRunner = new QueryRunner();

    /**
    * 执行sql语句Insert/Update/Delete
    */

    public int update(String sql,Object ... args) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        try {
           return queryRunner.update(connection,sql,args);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            connection.close();

        }

        return -1;

    }

    /**
     *查询返回一个javaBean的sql语句
     * @param type  返回对象的类型
     * @param sql   执行的sql语句
     * @param args  sql语句的参数
     * @param <T>   返回类型的范型
     * @return
     */
    public <T> T queryForOne(Class<T> type,String sql,Object ... args) throws SQLException {

        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.query(connection,sql,new BeanHandler<T>(type),args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return null;

    }


    /**
     * 查询返回多个javaBean的sql语句
     * @param type  返回对象的类型
     * @param sql   执行的sql语句
     * @param args  sql语句的参数
     * @param <T>   返回类型的范型
     * @throws SQLException
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object ... args) throws SQLException {

        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.query(connection,sql,new BeanListHandler<T>(type),args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return null;

    }


    /**
     *执行返回一行一列的sql语句
     * @param sql sql语句
     * @param args sql对应的参数值
     * @return
     * @throws SQLException
     */
    public Object queryForSingleValue(String sql,Object ... args) throws Exception {

        Connection connection = JdbcUtils.getConnection();

        try {
            return queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        return null;

    }

}
