package com.rewards.client;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rewards.domain.Customer;
import com.rewards.domain.TransactionHistory;

@CrossOrigin(origins = "http://localhost:3000")
public interface RewardsRestClient {

	@GetMapping(value = "/rewards/customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomers();

	@GetMapping(value = "/rewards/customer/{customerId}/{year}/{month}", produces = MediaType.APPLICATION_JSON_VALUE)
	public TransactionHistory getTransactionHistory(@PathVariable Long customerId, @PathVariable Integer year,
			@PathVariable Integer month);
}
