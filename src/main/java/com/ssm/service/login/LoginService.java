package com.ssm.service.login;


import com.ssm.common.ServerResponse;
import com.ssm.pojo.User;

/**
 * 用户登陆service
 * @author ASUS
 */
public interface LoginService {

    com.ssm.common.ServerResponse<User> login(String username, String password);


    ServerResponse<User> loginForUser(User user);
}
