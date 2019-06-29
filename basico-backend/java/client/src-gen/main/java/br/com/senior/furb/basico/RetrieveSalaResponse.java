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
 * Response method for retrieveSala
 */
@CommandDescription(name="retrieveSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="retrieveSalaResponse")
public interface RetrieveSalaResponse extends MessageHandler {

	void retrieveSalaResponse(Sala response);
	
	void retrieveSalaResponseError(ErrorPayload error);

}
