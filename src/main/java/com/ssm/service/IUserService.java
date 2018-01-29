package com.ssm.service;

import com.ssm.common.ServerResponse;
import com.ssm.pojo.User;


public interface IUserService {

    ServerResponse<User> login(String username, String password);

}
