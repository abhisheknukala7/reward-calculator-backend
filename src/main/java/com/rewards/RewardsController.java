package com.rewards;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.client.RewardsRestClient;
import com.rewards.domain.Customer;
import com.rewards.domain.TransactionHistory;
import com.rewards.service.RewardService;

@RestController
public class RewardsController implements RewardsRestClient {

	@Autowired
	private RewardService rewardService;

	@Override
	public List<Customer> getCustomers() {
		return rewardService.getCustomerAll();
	}

	@Override
	public TransactionHistory getTransactionHistory(Long customerId, Integer year, Integer month) {
		return rewardService.getCustTransactionHistory(customerId, year, month);
	}

}
