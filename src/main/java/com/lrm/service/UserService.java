package com.lrm.service;

import com.lrm.po.User;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-25 16:34
 * @Description : 描述
 */
public interface UserService {

    User checkUser(String username, String password);

}
