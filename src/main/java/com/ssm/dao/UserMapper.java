package com.ssm.dao;


import com.ssm.pojo.User;

public interface UserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	int checkUsername(String username);

	int checkEmail(String email);


	User selectByUsername(String username);
}