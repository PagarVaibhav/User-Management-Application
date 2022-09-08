package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Bindings.LoginForm;
import com.BikkadIT.Entities.UserAccounts;
import com.BikkadIT.Repositories.UserRepo;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public String loginCheck(LoginForm loginForm) {
		
		UserAccounts userAccount = this.userRepo.findByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
		
		if (userAccount != null) {
			String accStatus = userAccount.getAccountStatus();
			
			if (accStatus.equals("LOCKED")) {
				return "Your Account Is Locked";
				
			} else {
				return "Login Successfully. ***Welcome To Bikkad IT***";
			}
			
		} else {
			return "Invalid Credentials";
		}

	}

}
