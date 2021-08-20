package com.rewards.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rewards.domain.Transaction;

@Repository
public interface TransactionRepo extends CrudRepository<Transaction, Long> {

	@Query("Select t from Transaction t where t.customerId = ?1 and year(t.transactionDate) = ?2 and month(t.transactionDate) = ?3")
	List<Transaction> findAllByMonthAndYear(Long customerId, Integer year, Integer month);
}
