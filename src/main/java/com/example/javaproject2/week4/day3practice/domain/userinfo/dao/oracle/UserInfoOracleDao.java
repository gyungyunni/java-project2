package com.example.javaproject2.week4.day3practice.domain.userinfo.dao.oracle;

import com.example.javaproject2.week4.day3practice.domain.userinfo.UserInfo;
import com.example.javaproject2.week4.day3practice.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

    public void insertUserInfo(UserInfo userInfo){
        System.out.println("insert into ORACLE DB userId =" + userInfo.getUserId() );
    }

    public void updateUserInfo(UserInfo userInfo){
        System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
    }

    public void deleteUserInf(UserInfo userInfo){
        System.out.println("delete from ORACLE DB userId = " + userInfo.getUserId());
    }
}
