package com.ssm.controller.login;


import com.ssm.common.ServerResponse;
import com.ssm.pojo.User;
import com.ssm.service.login.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * 登陆controller
 *
 * @author ASUS
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    public String gotoLoginIndex() {
        return "login/loginIndex";
    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> loginIn(User user, HttpServletResponse response) {
        if (user != null) {
            if(StringUtils.isBlank(user.getUsername())){
                return ServerResponse.ERROR("用户名为空");
            }

            if (StringUtils.isBlank(user.getPassword())) {
                return ServerResponse.ERROR("密码为空");
            }
        }else{
            return ServerResponse.ERROR("用户名和密码为空");
        }

        ServerResponse serverResponse = loginService.loginForUser(user);
        if (serverResponse.isSuccess()){
            String ticket = UUID.randomUUID().toString();
            Cookie mycookie=new Cookie("ticket",ticket);
            mycookie.setPath("/");
            response.addCookie(mycookie);
        }


        return serverResponse;
    }


}
