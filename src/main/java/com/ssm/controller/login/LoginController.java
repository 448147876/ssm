package com.ssm.controller.login;


import com.ssm.common.ReturnData;
import com.ssm.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登陆controller
 * @author ASUS
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public String gotoLoginIndex(){
        return "login/loginIndex";
    }

    @RequestMapping(value = "/toLogin",method = RequestMethod.POST)
    @ResponseBody
    public ReturnData<?> loginIn(){
       // System.out.println(username+"   "+password+"  "+validationCode);


        return ReturnData.SUCCESS();
    }




}
