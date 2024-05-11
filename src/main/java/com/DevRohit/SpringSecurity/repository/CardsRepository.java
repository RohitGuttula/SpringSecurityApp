package com.DevRohit.SpringSecurity.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards,Integer> {
	List<Cards> findByCustomerId(int customerId);
}
