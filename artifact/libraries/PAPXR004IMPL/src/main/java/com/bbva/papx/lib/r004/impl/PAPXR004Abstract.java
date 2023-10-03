package com.bbva.papx.lib.r004.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.elara.utility.jdbc.JdbcUtils;
import com.bbva.papx.lib.r004.PAPXR004;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class PAPXR004Abstract extends AbstractLibrary implements PAPXR004 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected JdbcUtils jdbcUtils;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param jdbcUtils the this.jdbcUtils to set
	*/
	public void setJdbcUtils(JdbcUtils jdbcUtils) {
		this.jdbcUtils = jdbcUtils;
	}

}