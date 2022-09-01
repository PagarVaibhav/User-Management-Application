package com.BikkadIT.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="STATES_MASTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StateDetails {

	@Column(name="STATE_ID" , nullable=false , length = 20)
	private Integer stateId;
	
	@Column(name="STATE_NAME" , nullable=false , length = 100)
	private String stateName;
}
