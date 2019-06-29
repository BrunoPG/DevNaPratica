/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;

/**
 * Response method for listTipo
 */
@CommandDescription(name="listTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="listTipoResponse")
public interface ListTipoResponse extends MessageHandler {

	void listTipoResponse(Tipo.PagedResults response);
	
	void listTipoResponseError(ErrorPayload error);

}
