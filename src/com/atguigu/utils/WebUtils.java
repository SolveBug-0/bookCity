package com.atguigu.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @description:
 * @author: solveBug
 * @time: 2021/6/4 9:04
 */
public class WebUtils {

    public static <T> T copyParamToBean(Map value, T Bean){
        try {
            System.out.println("注入之前"+Bean);
            /**
             * 将请求参数value注入到Bean对象中
             */
            BeanUtils.populate(Bean,value);
            System.out.println("注入之后"+Bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Bean;
    }
}
