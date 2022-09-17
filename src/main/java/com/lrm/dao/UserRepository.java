package com.lrm.dao;

import com.lrm.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-05-25 16:39
 * @Description : 描述
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
