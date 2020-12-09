package com.gladiators.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gladiators.model.UserLogin;
import com.gladiators.repository.LoginRepository;


@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public UserLogin verifyUser(String email) {

		Optional<UserLogin> userLoginDetails=loginRepository.findById(email);
		boolean res = userLoginDetails.isPresent();
		UserLogin login = null;
		if (res) {
			login = userLoginDetails.get();
		}
		System.out.println(login);
		return login;
	}

}
