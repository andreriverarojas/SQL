package com.bbva.papx.lib.r004.impl;

import com.bbva.papx.dto.user.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.NoResultException;
import java.util.*;

public class PAPXR004Impl extends PAPXR004Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXR004Impl.class);
	private static final String INSERT = "PAPX.INSERT_PAPX_CUSTOMER";
	private static final String SELECT = "PAPX.Select_PAPX_CUSTOMER";

	@Override
	public String executeInsertUser(UserDTO userDTO) {
		LOGGER.info("[APX-R1] Ingreso de parametro : {}", userDTO);
		int result = 0;
		if(userDTO != null){
			Map<String, Object> cliente = new HashMap<>();
			cliente.put("NAME", userDTO.getName());
			cliente.put("LASTNAME", userDTO.getLastName());
			cliente.put("EMAIL", userDTO.getEmail());
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

	@Override
	public List<String> executeLeerUser() {
		LOGGER.info("Consultando clientes ");
		//Map<String, Object> parameter = new HashMap<>();
		List<Map<String, Object>> clientes = null;
		try {
			clientes = this.jdbcUtils.queryForList(SELECT);
			LOGGER.info("Clientes {}",clientes);

		} catch (NoResultException ex) {
			LOGGER.error(String.format("[Error al consultar clientes]"));
		}
		List<String> nombres = new ArrayList<>();
		for (Map<String,Object> name :clientes ){
			nombres.add((String) name.get("NAME"));
			nombres.add((String) name.get("LASTNAME"));
			nombres.add((String) name.get("EMAIL"));
		}
		return nombres;
	}

	@Override
	public void execute() {

	}

}
