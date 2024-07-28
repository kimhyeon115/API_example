package com.example.main.login.service;

import java.util.HashMap;
import org.springframework.http.ResponseEntity;
import com.example.main.common.model.ResponseData;

public interface LoginService {
	
	ResponseEntity<ResponseData> login(HashMap<String, Object> paramHashMap);

}