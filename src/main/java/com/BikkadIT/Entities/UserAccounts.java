package com.BikkadIT.Entities;

import java.time.LocalDate;
import java.util.Date;

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
	
	@Column(name="USER_PHNO" , nullable=false , length = 100)
	private Integer userPhNo;
	
	@Column(name="USER_DOB" , nullable=false , length = 50)
	private Date userDob;
	
	@Column(name="USER_GENDER" , nullable=false , length = 25)
	private String gender;
	
	@Column(name="USER_COUNTRY" , nullable=false , length = 100)
	private String country;
	
	@Column(name="USER_STATE" , nullable=false , length = 100)
	private String state;
	
	@Column(name="USER_CITY" , nullable=false , length = 85)
	private String city;
	
	@Column(name="ACTIVE_SWITCH" )
	private Character activeSwitch;
	
	@Column(name="CREATED_DATE" ,updatable =false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name="UPDATED_DATE" ,insertable =false)
	@UpdateTimestamp
	private LocalDate  updateDate;
	
	@Column(name="USER_PASSWORD" , nullable=false , length = 50)
	private String userPassword;
	
}
