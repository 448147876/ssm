package com.ssm.controller.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginIndexController {

    @RequestMapping("/ssm")
    public String gotoLoginIndex(HttpServletResponse response, HttpServletRequest request){

        return "login/loginIndex";
    }


}
