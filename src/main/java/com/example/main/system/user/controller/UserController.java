package com.example.main.system.user.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.common.model.ResponseData;
import com.example.main.system.user.service.UserService;

@RestController
@RequestMapping({"/api/system/user"})
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping({"/status/1"})
	public ResponseEntity<ResponseData> insertSample(@RequestBody HashMap<String, Object> paramMap) {
		return userService.insertUser(paramMap);
	}

}
