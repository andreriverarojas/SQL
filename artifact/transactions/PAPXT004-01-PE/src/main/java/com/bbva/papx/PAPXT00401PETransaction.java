package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.papx.dto.user.UserDTO;
import com.bbva.papx.lib.r004.PAPXR004;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * transcacciones para usuario
 *
 */
public class PAPXT00401PETransaction extends AbstractPAPXT00401PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00401PETransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		PAPXR004 papxR004 = this.getServiceLibrary(PAPXR004.class);

		UserDTO user = new UserDTO();
		user.setName(this.getName());

		papxR004.executeInsertUser(user);
		List<String> userOut = papxR004.executeLeerUser();
		this.setUsuarios(userOut);

		this.setSeverity(Severity.OK);
		this.setHttpResponseCode(HttpResponseCode.HTTP_CODE_200);
	}

}
