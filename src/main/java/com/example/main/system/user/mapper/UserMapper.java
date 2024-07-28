package com.example.main.system.user.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.example.main.system.user.model.User;

@Mapper
public interface UserMapper {
	
	User selectUser(HashMap<String, Object> paramHashMap);
	
	int updateLastLoginDt(HashMap<String, Object> paramHashMap);
	
	int insertUser(HashMap<String, Object> paramHashMap);
	
	User selectUserByAll(HashMap<String, Object> paramHashMap);
	
	int cntUserByAll(HashMap<String, Object> paramMap);
	
}
