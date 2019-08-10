package com.howtodoinjava.demo.service;

import com.howtodoinjava.demo.model.Login;
import com.howtodoinjava.demo.model.User;



public interface UserService {

void register(User user);

User validateUser(Login login);

void updatelogincount(User user);
}
