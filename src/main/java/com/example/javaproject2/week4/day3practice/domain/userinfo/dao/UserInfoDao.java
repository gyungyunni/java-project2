package com.example.javaproject2.week4.day3practice.domain.userinfo.dao;

import com.example.javaproject2.week4.day3practice.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInf(UserInfo userInfo);
}
