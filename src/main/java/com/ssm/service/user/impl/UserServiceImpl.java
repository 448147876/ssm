package com.ssm.service.user.impl;


import com.ssm.common.ServerResponse;
import com.ssm.dao.user.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ServerResponse<User> login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if(StringUtils.isEmpty(user)){
            return ServerResponse.createByErrorMessage("用户不存在");
        }else{
            if(Objects.equals(password,user.getPassword())){
                user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
                return ServerResponse.createBySuccess("登录成功",user);
            }else {
                return ServerResponse.createByErrorMessage("密码错误");
            }


        }
    }



}
