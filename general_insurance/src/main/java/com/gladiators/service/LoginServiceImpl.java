package com.gladiators.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gladiators.dao.LoginDao;
import com.gladiators.model.UserLogin;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao loginDao;

	@Override
	public String verifyUser(String email, String password) {
		UserLogin userLoginDetails = loginDao.verifyUser(email);
		String verifiedResult=null;
		if(userLoginDetails==null) {
			verifiedResult ="No such user found";
		}
		else if(password.equals(userLoginDetails.getPassword())) {
			verifiedResult ="Correct password";
		}
		else {
			verifiedResult ="Incorrect password";
		}
		return verifiedResult;
	}
	

}
