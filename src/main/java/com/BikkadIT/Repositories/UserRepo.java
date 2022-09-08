package com.BikkadIT.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entities.UserAccounts;
@Repository
public interface UserRepo extends JpaRepository<UserAccounts, Integer>{

	public UserAccounts findByEmailAndPassword(String email , String password);
}
