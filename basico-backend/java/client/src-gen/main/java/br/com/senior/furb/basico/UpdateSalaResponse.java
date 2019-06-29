/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Sala;

/**
 * Response method for updateSala
 */
@CommandDescription(name="updateSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateSalaResponse")
public interface UpdateSalaResponse extends MessageHandler {

	void updateSalaResponse(Sala response);
	
	void updateSalaResponseError(ErrorPayload error);

}
