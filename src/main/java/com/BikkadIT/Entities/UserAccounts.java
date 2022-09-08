package com.BikkadIT.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_ACCOUNTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_FIRSTNAME" , nullable=false , length = 50)
	private String userFirstName;
	
	@Column(name="USER_LASTNAME" , nullable=false , length = 50)
	private String userLastName;
	
	@Column(name="USER_EMAIL" , nullable=false , length = 100)
	private String userEmail;
	
	@Column(name="USER_PASSWORD" , nullable=false , length = 50)
	private String userPassword;
	
	@Column(name="USER_PHNO" , nullable=false , length = 100)
	private Long userPhNo;
	
	@Column(name="USER_DOB" , nullable=false , length = 50)
	private LocalDate userDob;
	
	@Column(name="USER_GENDER" , nullable=false , length = 25)
	private String gender;
	
	@Column(name="COUNTRY_ID" , nullable=false , length = 100)
	private Integer countryId;
	
	@Column(name="STATE_ID" , nullable=false , length = 100)
	private Integer stateId;
	
	@Column(name="CITY_ID" , nullable=false , length = 85)
	private Integer cityId;
	
	@Column(name="ACCOUNT_STATUS" )
	private String accountStatus;
	
	@Column(name="CREATED_DATE" ,updatable =false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE" ,insertable =false)
	@UpdateTimestamp
	private LocalDate  updateDate;
	
	
	
}
