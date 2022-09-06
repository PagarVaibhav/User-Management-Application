package com.BikkadIT.Bindings;

import java.time.LocalDate;

import lombok.Data;
@Data
public class UserForm {

	private String userFirstName;
	
	private String userLastName;
	
	private String userEmail;
	
	private String userPassword;
	
	private Long userPhNo;
	
	private LocalDate userDob;
	
	private String gender;
	
	private Integer countryId;
	
	private Integer stateId;
	
	private Integer cityId;
	
	private Character accountStatus;
}
