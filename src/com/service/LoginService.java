package com.service;

import org.springframework.stereotype.Service;

import com.bean.Login;

@Service
public class LoginService {
	
	public String checkAdminUser(Login login) {
		if(login.getEmail().equals("admin@gmail.com") && login.getPassword().equals("admin")) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public String checkCustomerUser(Login login) {
//		if(loginDao.checkLoginDetails(login) > 0) {
//			return "success";
//		}else {
//			return "failure";
//		}
		return null;
	}
}
