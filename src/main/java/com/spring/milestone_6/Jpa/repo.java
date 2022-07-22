package com.spring.milestone_6.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.milestone_6.Entity.Customer;

@Repository
public interface repo extends JpaRepository<Customer,Integer>{

}
