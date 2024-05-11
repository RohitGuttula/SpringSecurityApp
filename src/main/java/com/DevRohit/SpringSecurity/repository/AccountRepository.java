package com.DevRohit.SpringSecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts,Long> {
	
	Accounts findByCustomerId(int customerId);

}
