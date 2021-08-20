package com.rewards.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionHistory {

	private List<Transaction> transactions;
	private Long totalPoints;
}
