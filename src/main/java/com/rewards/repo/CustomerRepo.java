package com.rewards.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rewards.domain.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

	List<Customer> findAll();
}
