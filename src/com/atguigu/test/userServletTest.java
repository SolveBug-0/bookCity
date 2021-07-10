package com.atguigu.test;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/6/3 20:59
 */
public class userServletTest {

    public void login(){
        System.out.println("login方法调用");
    }
    public void regist(){
        System.out.println("regist方法调用");
    }
    public void UpdateUser(){
        System.out.println("UpdateUser方法调用");
    }
    public void UpdateUserPassword(){
        System.out.println("UpdateUserPassword方法调用");
    }

    public static void main(String[] args) {
        String action = "login";

        try {
            //获取action业务鉴别字符串，获取相应的业务 方法反射对象
            Method method = userServletTest.class.getDeclaredMethod(action);
            System.out.println(method);

            //调用业务的方法
            method.invoke(new userServletTest());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
