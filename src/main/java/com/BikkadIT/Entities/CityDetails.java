package com.BikkadIT.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="CITIES_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDetails {

	
	@Column(name="CITY_ID" , nullable=false , length = 20)
	private Integer cityId;
	
	@Column(name="CITY_NAME" , nullable=false , length = 100)
	private String cityName;
}
