package com.howtodoinjava.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.model.Login;
import com.howtodoinjava.demo.model.User;
import com.howtodoinjava.demo.service.UserService;

@Controller
public class LoginController {
  @Autowired
  UserService userService;
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("login") Login login) {
   // ModelAndView mav = null;
    User user = userService.validateUser(login);
        
    if (null != user) {
//    mav = new ModelAndView("welcome");
//    mav.addObject("firstname", user.getFirstname());
    	  return new ModelAndView("welcome", "firstname", user.getFirstname());
    } else {
    	
    	System.out.println("HEre");

    	
    	int new_count = user.getNo_of_attempts() +1;
    	System.out.println(new_count);
    	user.setNo_of_attempts(new_count);
    	
    	userService.updatelogincount(user);
    	
    	System.out.println("HEre");
    	
    	if(user.getNo_of_attempts()>=3 )
    		return new ModelAndView("Timer");
    	
//    mav = new ModelAndView("login");
//    mav.addObject("message", "Username or Password is wrong!!");
    	else return new ModelAndView("failure", "no_of_attempts", user.getNo_of_attempts());

    }
    //return mav;
  }
}