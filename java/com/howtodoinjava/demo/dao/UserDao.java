package com.howtodoinjava.demo.dao;

import com.howtodoinjava.demo.model.Login;
import com.howtodoinjava.demo.model.User;

public interface UserDao {
void register(User user);
User validateUser(Login login);

void updatelogincount(User user);
}
