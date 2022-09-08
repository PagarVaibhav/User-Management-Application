package com.BikkadIT.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Bindings.LoginForm;
import com.BikkadIT.Entities.CityDetails;
import com.BikkadIT.Entities.CountryDetails;
import com.BikkadIT.Entities.StateDetails;
import com.BikkadIT.Entities.UserAccounts;
import com.BikkadIT.Repositories.CityRepo;
import com.BikkadIT.Repositories.CountryRepo;
import com.BikkadIT.Repositories.StateRepo;
import com.BikkadIT.Repositories.UserRepo;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private CityRepo cityRepo;
	
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


	@Override
	public Map<Integer, String> getCountries() {
		
		List<CountryDetails> findAll = this.countryRepo.findAll();
		
		Map<Integer, String> countryMap = new HashMap<Integer, String>();
		
		for (CountryDetails u : findAll) {
			countryMap.put(u.getCountryId(), u.getCountryName());
		}
		return countryMap;
	}


	@Override
	public Map<Integer, String> getStates(Integer countryId) {
		
		List<StateDetails> states = this.stateRepo.findByCountryId(countryId);
		
		Map<Integer, String> statemap = new HashMap<Integer, String>();
		
		for (StateDetails u : states) {
			statemap.put(u.getStateId(), u.getStateName());
		}
		return statemap;
	}


	@Override
	public Map<Integer, String> getCities(Integer stateId) {
		
		List<CityDetails> findByStateId = this.cityRepo.findByStateId(stateId);
		
		Map<Integer, String> cityMap = new HashMap<Integer, String>();

		for (CityDetails u : findByStateId) {
			cityMap.put(u.getCityId(), u.getCityName());
		}
		return cityMap;
		
	}

}
