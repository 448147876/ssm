package com.ssm.controller.user;


import com.ssm.common.ServerResponse;
import com.ssm.pojo.User;
import com.ssm.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user/")
public class UserController {


    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session){
        //ServerResponse<User> response = iUserService.login(username,password);


        return null;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(String username, String password, HttpSession sessionl) {
        //ServerResponse<User> response = iUserService.login("admin","123");
       // model.addAttribute("list", "aa");
        return "login/loginIndex";
    }









}
