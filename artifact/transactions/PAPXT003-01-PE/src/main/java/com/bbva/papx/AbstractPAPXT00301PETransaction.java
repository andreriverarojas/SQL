package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.papx.dto.user.UserDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractPAPXT00301PETransaction extends AbstractTransaction {

	public AbstractPAPXT00301PETransaction(){
	}


	/**
	 * Return value for input parameter user
	 */
	protected UserDTO getUser(){
		return (UserDTO)this.getParameter("user");
	}
}
