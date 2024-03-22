package com.homeloan.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


enum AdminRole{
	LOAN_OFFICER,
	CREDIT_ANALYST,
	SR_LOAN_OFFICER,
	CLERK
}


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Admin extends Person {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private AdminRole role;
	
}
