package com.ssm.service.user;

import com.ssm.common.ServerResponse;
import com.ssm.pojo.User;


public interface IUserService {

    ServerResponse<User> login(String username, String password);

}
