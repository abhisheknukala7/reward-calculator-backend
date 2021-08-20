package com.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rewards.domain.Customer;
import com.rewards.domain.Transaction;
import com.rewards.domain.TransactionHistory;
import com.rewards.repo.CustomerRepo;
import com.rewards.repo.TransactionRepo;

@Service
public class RewardService {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private TransactionRepo transactionRepo;

	/**
	 * Gets the customer all.
	 *
	 * @return the customer all
	 */
	public List<Customer> getCustomerAll() {
		return customerRepo.findAll();
	}

	/**
	 * Gets the customer transaction history.
	 *
	 * @param customerId the customer id
	 * @param year the year
	 * @param month the month
	 * @return the cust transaction history
	 */
	public TransactionHistory getCustTransactionHistory(Long customerId, Integer year, Integer month) {
		List<Transaction> transactions = transactionRepo.findAllByMonthAndYear(customerId, year, month);
		Long total = 0l;
		for (Transaction transaction : transactions) {
			Long rwdPoints = rewardCalculation(total);
			transaction.setPoints(rwdPoints);
			total += rwdPoints;
		}
		TransactionHistory history = new TransactionHistory();
		history.setTotalPoints(total);
		history.setTransactions(transactions);
		return history;
	}

	/**
	 * Reward calculation.
	 *
	 * @param total the total
	 * @return the long
	 */
	private Long rewardCalculation(Long total) {
		Long points = 0l;
		if (total > 50 && total <= 100) {
			points += (total.intValue() - 50) * 1;
		}

		if (total > 100) {
			points += 50; // for every dollar spent over $50 add 1 point
			points += (total.intValue() - 100) * 2; // for every dollar spent over $100 add 2 points
		}
		return points;
	}
}
