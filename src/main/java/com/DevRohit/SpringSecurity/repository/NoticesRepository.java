package com.DevRohit.SpringSecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.Notices;

@Repository
public interface NoticesRepository extends CrudRepository<Notices, Integer> {
	@Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
	List<Notices> findAllActiveNotices();
}
