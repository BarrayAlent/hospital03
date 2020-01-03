package com.ujiuye.dao;

import com.ujiuye.bean.Users;

public interface UserDao {

    Users getUserByUserNameAndPsw(String username, String password);
}
