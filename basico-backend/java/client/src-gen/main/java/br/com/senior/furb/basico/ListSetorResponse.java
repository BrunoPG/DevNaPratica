/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listSetor
 */
@CommandDescription(name="listSetorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listSetorResponse")
public interface ListSetorResponse extends MessageHandler {

	void listSetorResponse(Setor.PagedResults response);
	
	void listSetorResponseError(ErrorPayload error);

}
