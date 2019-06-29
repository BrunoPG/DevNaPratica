/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkSalaOutput;

/**
 * Response method for createBulkSala
 */
@CommandDescription(name="createBulkSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkSalaResponse")
public interface CreateBulkSalaResponse extends MessageHandler {

	void createBulkSalaResponse(CreateBulkSalaOutput response);
	
	void createBulkSalaResponseError(ErrorPayload error);

}
