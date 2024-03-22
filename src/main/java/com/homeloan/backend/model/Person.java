package com.homeloan.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Person {

	@Id
	@GeneratedValue
	private long id;

	@NotBlank(message = "First Name cannot be blank.")
	private String firstName;

	private String middleName;

	private String lastName;

	@NotNull
	@Email(message = "Enter a valid email address.")
	private String emaissl;

	@NotBlank(message = "Phone Number cannot be blank.")
	@Size(min = 10, max = 10, message = "Phone number must be 10 ten digits long.")
	private String phone;

	@NotBlank(message = "Password cannot be blank.")
	@Size(min = 6, message = "Password must be atleast six characters.")
	private String password;

}