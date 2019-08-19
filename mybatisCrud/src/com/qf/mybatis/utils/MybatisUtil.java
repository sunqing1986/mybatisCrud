package com.qf.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil   {
    private static SqlSessionFactory sqlSessionFactory=null;
    static{
        try {
            InputStream  in = Resources.getResourceAsStream("myBatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private MybatisUtil(){}
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
