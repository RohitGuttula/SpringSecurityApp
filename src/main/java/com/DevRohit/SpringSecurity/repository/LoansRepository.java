package com.DevRohit.SpringSecurity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans,Integer> {
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
