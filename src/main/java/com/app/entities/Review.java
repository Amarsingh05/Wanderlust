package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Review {
	@Id
	private int custId;
	@Column(length = 20,nullable = false)
	private String custName;
	private int bookingId;
	@Column(length = 150,nullable = false)
	private String review;
	

}