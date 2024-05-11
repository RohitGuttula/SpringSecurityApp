package com.DevRohit.SpringSecurity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.AccountTransactions;

@Repository
public interface AccountTransactionRepository extends CrudRepository
                          <AccountTransactions,Long>{
	
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);

}
