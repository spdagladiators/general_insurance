package com.gladiators.dao;

import com.gladiators.model.UserLogin;

public interface LoginDao {
	UserLogin verifyUser(String email);

}
