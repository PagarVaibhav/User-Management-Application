package com.BikkadIT.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Service.UserServiceI;

@RestController
public class UserRegistrationController {

	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping("/countries")
	public Map<Integer, String> countries() {
		
		Map<Integer, String> countries = this.userServiceI.getCountries();

		return countries;
	}
	
	@GetMapping("/states/{countryId}")
	public Map<Integer, String> states(@PathVariable Integer countryId) {
		
		Map<Integer, String> states = this.userServiceI.getStates(countryId);
		
		return states;
	}

	@GetMapping("/cities/{stateId}")
	public Map<Integer, String> cities(@PathVariable Integer stateId) {
		
		Map<Integer, String> cities = this.userServiceI.getCities(stateId);

		return cities;
	}
}
