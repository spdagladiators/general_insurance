package com.gladiators.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gladiators.model.UserLogin;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, String>{

	

}
