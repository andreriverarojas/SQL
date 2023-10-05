package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.user.UserDTO;
import java.util.List;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractPAPXT00401PETransaction extends AbstractTransaction {

	public AbstractPAPXT00401PETransaction(){
	}


	/**
	 * Return value for input parameter user
	 */
	protected UserDTO getUser(){
		return (UserDTO)this.getParameter("user");
	}

	/**
	 * Set value for List<String> output parameter usuarios
	 */
	protected void setUsuarios(final List<String> field){
		this.addParameter("usuarios", field);
	}
}
