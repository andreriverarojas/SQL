package com.bbva.papx.dto.user;

import java.io.Serializable;
import java.util.Objects;

/**
 * The UserDTO class...
 */
public class UserDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String name;
	private String lastName;
	private String email;

	public UserDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
