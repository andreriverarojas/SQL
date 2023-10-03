package com.bbva.papx.lib.r004;

import com.bbva.papx.dto.user.UserDTO;

import java.util.List;

/**
 * The  interface PAPXR004 class...
 */
public interface PAPXR004 {

	String  executeInsertUser(UserDTO userDTO);

	List<String> executeLeerUser();

}
