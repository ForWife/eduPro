package com.neu.controller;

import com.neu.beans.User;
import com.neu.service.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BackLoginHandler {
    @Autowired
    BackUserService userService;
    @RequestMapping(value = "/back/back_login")
    @ResponseBody
    public String Login(HttpServletRequest request,String username,String password){
        System.out.println(username+" "+password);
        User user=userService.getUserByName(username);
        System.out.println(user.getUsername()+" "+user.getUserpassword());
        if (user==null) {
            return "{\"result\":\"no such user\"}";
        }else if (user.getUserpassword().equals(password)){
            HttpSession session=request.getSession();
            session.setAttribute("user",user);
            return "{\"result\":\"success\"}";
        }else {
            return "{\"result\":\"failed\"}";
        }
    }
}
