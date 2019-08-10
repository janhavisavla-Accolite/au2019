package com.howtodoinjava.demo.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.howtodoinjava.demo.dao.UserDao;
import com.howtodoinjava.demo.model.Login;
import com.howtodoinjava.demo.model.User;


public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }
  
  public void updatelogincount(User user)
  {
	  userDao.updatelogincount(user);
  }

}