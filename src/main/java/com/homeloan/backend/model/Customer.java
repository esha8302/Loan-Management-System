package com.homeloan.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer extends Person {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min = 16, max = 16, message = "Account Number must be 16 digits.")
	private String accountNumber;
	
}
