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
		LOGGER.info("[APX-1] Instancia PAPXR003  : {}", papxR003);

		UserDTO request = this.getUser();
		LOGGER.info("[APX-2] Captura de entrada : {}", request.toString());

		String requestOut = papxR003.executeSaveUser(request);
		LOGGER.info("[APX-3] idCustomer  : {}", requestOut);

		if( requestOut == null || this.getAdviceList().isEmpty()){
			LOGGER.info("[APX-4] Save Not Success id : {}", requestOut);
			this.setSeverity(Severity.ENR);
		}else {
			LOGGER.info("[APX-5] Save Success :{}", requestOut);
			this.setSeverity(Severity.OK);
		}
	}
}