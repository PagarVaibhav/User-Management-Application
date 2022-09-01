package com.BikkadIT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entities.CityDetails;
@Repository
public interface CityRepo extends JpaRepository<CityDetails, Integer>{

}
