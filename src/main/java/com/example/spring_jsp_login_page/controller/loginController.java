package com.example.spring_jsp_login_page.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class loginController {

    @GetMapping("/login")
    public ModelAndView loginPage(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @PostMapping("/login")
    public ModelAndView welcomePage(@RequestParam(value = "username")String username,
           @RequestParam(value = "password")String password){

        ModelAndView mv=new ModelAndView();
        if(username.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("1234")){
            mv.addObject("name",username);
            mv.setViewName("welcome");
        }
        mv.addObject("errmsg","please enter proper user and password");
        return mv;
    }
}
