package com.gladiators.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gladiators.model.UserLogin;
import com.gladiators.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	@Autowired
	private LoginService loginService;

	/*
	 * @PostMapping(path="/verifyuser")
	 * 
	 * @ResponseBody public String verifyUser(@ModelAttribute UserLogin userLogin) {
	 * String verifiedResult =
	 * loginService.verifyUser(userLogin.getEmail(),userLogin.getPassword()); return
	 * verifiedResult; }
	 */

	@GetMapping(path="/verifyuser/{email}/{password}")
	@ResponseBody
	public String verifyUser(@PathVariable("email") String email,@PathVariable("password") String password) {
		String verifiedResult = loginService.verifyUser(email, password);
		return verifiedResult;
	}

}
