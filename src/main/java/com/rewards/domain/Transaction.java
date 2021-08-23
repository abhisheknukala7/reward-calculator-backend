package com.rewards.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long customerId;
	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionDate;

	private Long total;
	private Long points;

	@Override
	public String toString() {
		return String.format("Transaction [id=%s, customerId=%s, transactionDate=%s, total=%s]", id, customerId,
				transactionDate, total);
	}

}
