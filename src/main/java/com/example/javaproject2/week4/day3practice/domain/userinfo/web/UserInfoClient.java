package com.example.javaproject2.week4.day3practice.domain.userinfo.web;

import com.example.javaproject2.week4.day3practice.domain.userinfo.UserInfo;
import com.example.javaproject2.week4.day3practice.domain.userinfo.dao.UserInfoDao;
import com.example.javaproject2.week4.day3practice.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import com.example.javaproject2.week4.day3practice.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException, IOException {

        FileInputStream fis = new FileInputStream("db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("CR7");
        userInfo.setPasswd("486");
        userInfo.setUserName("크리스티아누 호날두");


        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")){
            userInfoDao = new UserInfoOracleDao();
        }
        else if(dbType.endsWith("MYSQL")){
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db support error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInf(userInfo);
    }
}
