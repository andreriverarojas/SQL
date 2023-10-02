package com.bbva.papx.lib.r003.impl;

import com.bbva.papx.dto.user.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NoResultException;
import java.util.HashMap;
import java.util.Map;

public class PAPXR003Impl extends PAPXR003Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR003Impl.class);

	private static final String  insert = "PAPX.INSERT_PAPX_CUSTOMER";
	private static final String  ERR_PARAMETERS_OK = "PAPX10000000";
	private static final String ERR_EXISTE_DATA = "PAPX10000001";

	/*@Override
	public void execute() {
		// TODO - Implementation of business logic
	}*/

	@Override
	public String executeSaveUser(UserDTO userDTO) {
		LOGGER.info("[APX-R1] datos del parametro de entrada : {}", userDTO);
		int resultSQL = 0;
		if(userDTO.getUserId() != null){
			Map<String, Object> usuarioSQL = new HashMap<>();
			usuarioSQL.put("usuario Id", userDTO.getUserId());
			usuarioSQL.put("name", userDTO.getName());
			usuarioSQL.put("email", userDTO.getEmail());
			try{
				LOGGER.info("[APX-R3] Acceso a jdbcUtils ");
				resultSQL = this.jdbcUtils.update(insert, usuarioSQL);
			}catch (NoResultException ne){
				LOGGER.error(String.format("[APX-R4] Error en executeSaveUser : {}", ne.getMessage()));
				this.addAdvice(ERR_EXISTE_DATA);
			}
		}else {
			LOGGER.info("[APX-R5] Error entrada (nulo): {}");
			this.addAdvice(ERR_PARAMETERS_OK);
		}
		LOGGER.info("[APX-R6] Resultado : {}", resultSQL);
		return String.valueOf(resultSQL);
	}
}