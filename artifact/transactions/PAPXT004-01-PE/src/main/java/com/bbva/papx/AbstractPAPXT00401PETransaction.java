package com.bbva.papx;

import com.bbva.elara.transaction.AbstractTransaction;
import java.util.List;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractPAPXT00401PETransaction extends AbstractTransaction {

	public AbstractPAPXT00401PETransaction(){
	}


	/**
	 * Return value for input parameter name
	 */
	protected String getName(){
		return (String)this.getParameter("name");
	}

	/**
	 * Set value for List<String> output parameter usuarios
	 */
	protected void setUsuarios(final List<String> field){
		this.addParameter("usuarios", field);
	}
}
