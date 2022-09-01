package com.BikkadIT.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="COUNTRY_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryDetails {

	@Column(name="COUNTRY_ID" , nullable=false , length = 20)
	private Integer countryId;
	
	@Column(name="COUNTRY_NAME" , nullable=false , length = 100)
	private String countryName;
}
