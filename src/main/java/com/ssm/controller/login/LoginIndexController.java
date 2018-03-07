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

        Cookie cookie = new Cookie("a", "1");
        cookie.setPath("/");

        response.addCookie(cookie);
        return "login/loginIndex";
    }


}
