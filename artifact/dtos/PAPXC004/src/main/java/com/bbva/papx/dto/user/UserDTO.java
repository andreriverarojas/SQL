package com.bbva.papx.dto.user;

import java.io.Serializable;
import java.util.Objects;

/**
 * The UserDTO class...
 */
public class UserDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String name;

	public UserDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserDTO{" +
				"name='" + name + '\'' +
				'}';
	}
}
