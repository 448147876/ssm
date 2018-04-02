package com.ssm.service.login.impl;


import com.ssm.common.ServerResponse;
import com.ssm.dao.user.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.login.LoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if (StringUtils.isEmpty(username)) {
            return ServerResponse.ERROR("用户不存在");
        } else {
            if (Objects.equals(password, user.getPassword())) {
                user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
                return ServerResponse.SUCCESS("登录成功", user);
            } else {
                return ServerResponse.ERROR("密码错误");
            }


        }
    }


    @Override
    public ServerResponse<User> loginForUser(User user) {
        User userQry = userMapper.selectByUsername(user.getUsername());
        if (userQry == null || StringUtils.isBlank(userQry.getUsername())) {
            return ServerResponse.ERROR("用户不存在");
        } else {
            if (Objects.equals(userQry.getPassword(), user.getPassword())) {
                user.setPassword(StringUtils.EMPTY);
                return ServerResponse.SUCCESS("登录成功", userQry);
            } else {
                return ServerResponse.ERROR("密码错误");
            }
        }
    }
}
