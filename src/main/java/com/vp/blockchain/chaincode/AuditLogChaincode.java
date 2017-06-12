/**
 * 
 */
package com.vp.blockchain.chaincode;

import static java.lang.String.format;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hyperledger.fabric.shim.ChaincodeBase;
import org.hyperledger.fabric.shim.ChaincodeStub;

/**
 * @author kgangatharan
 *
 */
public class AuditLogChaincode extends ChaincodeBase {

	private static Log log = LogFactory.getLog(AuditLogChaincode.class);

	/* (non-Javadoc)
	 * @see org.hyperledger.fabric.shim.ChaincodeBase#init(org.hyperledger.fabric.shim.ChaincodeStub)
	 */
	@Override
	public Response init(ChaincodeStub stub) {
		final String function = stub.getFunction();
		if (!function.equals("init")) {
			return newErrorResponse(format("Unknown function: %s", function));
		}
		return init(stub, stub.getParameters().stream().toArray(String[]::new));
	}

	/* (non-Javadoc)
	 * @see org.hyperledger.fabric.shim.ChaincodeBase#invoke(org.hyperledger.fabric.shim.ChaincodeStub)
	 */
	@Override
	public Response invoke(ChaincodeStub arg0) {
		// TODO Implement invoke service
		return null;
	}

	private Response init(ChaincodeStub stub, String[] args) {
		//TODO Implement init service

		return newSuccessResponse();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info(String.format("Starting chaincode for audit log service..."));
		new AuditLogChaincode().start(args);
		log.info(String.format("Started chaincode for audit log service"));
	}

}
