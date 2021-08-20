package com.rewards.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {

	@Id
	private Long id;
	private String name;

	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s]", id, name);
	}
}
