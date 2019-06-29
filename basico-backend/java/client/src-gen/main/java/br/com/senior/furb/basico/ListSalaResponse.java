/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listSala
 */
@CommandDescription(name="listSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listSalaResponse")
public interface ListSalaResponse extends MessageHandler {

	void listSalaResponse(Sala.PagedResults response);
	
	void listSalaResponseError(ErrorPayload error);

}
