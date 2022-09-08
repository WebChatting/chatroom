package com.sxrekord.chatting.dao;

import com.sxrekord.chatting.model.po.UserInfo;

public interface UserInfoDao {

    void loadUserInfo();
    
    UserInfo getByUsername(String username);

    /**
     * 通过 userId 得到用户信息
     * @param userId
     * @return
     */
    UserInfo getByUserId(String userId);
}