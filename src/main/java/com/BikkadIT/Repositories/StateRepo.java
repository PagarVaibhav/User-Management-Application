package com.BikkadIT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entities.StateDetails;
@Repository
public interface StateRepo extends JpaRepository<StateDetails, Integer>{

}
