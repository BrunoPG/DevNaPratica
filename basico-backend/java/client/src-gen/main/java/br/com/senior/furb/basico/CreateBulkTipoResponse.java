/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.CreateBulkTipoOutput;

/**
 * Response method for createBulkTipo
 */
@CommandDescription(name="createBulkTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkTipoResponse")
public interface CreateBulkTipoResponse extends MessageHandler {

	void createBulkTipoResponse(CreateBulkTipoOutput response);
	
	void createBulkTipoResponseError(ErrorPayload error);

}
