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
	 * Set value for List<String> output parameter userOut
	 */
	protected void setUserout(final List<String> field){
		this.addParameter("userOut", field);
	}

	/**
	 * Set value for String output parameter userIn
	 */
	protected void setUserin(final String field){
		this.addParameter("userIn", field);
	}
}
