package com.bbva.papx;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.papx.dto.user.UserDTO;
import com.bbva.papx.lib.r003.PAPXR003;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * transcacion para usuario
 *
 */
public class PAPXT00301PETransaction extends AbstractPAPXT00301PETransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(PAPXT00301PETransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		PAPXR003 papxR003 = this.getServiceLibrary(PAPXR003.class);

		UserDTO request = this.getUser();
		String requestOut = papxR003.executeSaveUser(request);
		if( requestOut == null || this.getAdviceList().isEmpty()){
			this.setSeverity(Severity.ENR);
		}else {
			this.setSeverity(Severity.OK);
		}
	}
}