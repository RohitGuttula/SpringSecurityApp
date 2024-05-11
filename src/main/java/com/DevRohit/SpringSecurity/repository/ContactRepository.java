package com.DevRohit.SpringSecurity.repository;

import org.springframework.stereotype.Repository;

import com.DevRohit.SpringSecurity.model.Contact;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {

}
