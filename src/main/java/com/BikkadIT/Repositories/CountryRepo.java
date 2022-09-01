package com.BikkadIT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entities.CountryDetails;
@Repository
public interface CountryRepo extends JpaRepository<CountryDetails, Integer> {

}
