/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Tipo;

/**
 * Response method for createTipo
 */
@CommandDescription(name="createTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createTipoResponse")
public interface CreateTipoResponse extends MessageHandler {

	void createTipoResponse(Tipo response);
	
	void createTipoResponseError(ErrorPayload error);

}
