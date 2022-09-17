package com.lrm.service;

import com.lrm.dao.UserRepository;
import com.lrm.po.User;
import com.lrm.uitl.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-25 16:34
 * @Description : 描述
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;

    }

}
