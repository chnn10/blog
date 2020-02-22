package com.chnn10.service;

import com.chnn10.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
