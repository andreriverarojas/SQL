package com.bbva.papx.lib.r004.impl;

import com.bbva.papx.dto.user.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NoResultException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PAPXR004Impl extends PAPXR004Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR004Impl.class);
	private static final String INSERT = "PAPX.INSERT_PAPX_CUSTOMER";

	@Override
	public String executeInsertUser(UserDTO userDTO) {
		int result = 0;
		if(userDTO != null){
			Map<String, Object> cliente = new HashMap<>();
			cliente.put("NAME", userDTO.getName());
			try{
				result = this.jdbcUtils.update(INSERT, cliente);
			}catch (NoResultException ne){
				LOGGER.error(String.format("[Error al ingresar usuario"));
			}
		}else {
			LOGGER.info("Valor ingresado es null");
		}
		return String.valueOf(result);
	}


}
