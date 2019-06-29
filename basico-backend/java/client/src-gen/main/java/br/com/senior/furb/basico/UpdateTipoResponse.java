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
 * Response method for updateTipo
 */
@CommandDescription(name="updateTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateTipoResponse")
public interface UpdateTipoResponse extends MessageHandler {

	void updateTipoResponse(Tipo response);
	
	void updateTipoResponseError(ErrorPayload error);

}
