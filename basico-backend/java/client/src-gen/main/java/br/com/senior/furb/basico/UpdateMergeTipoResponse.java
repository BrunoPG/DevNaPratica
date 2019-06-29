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
 * Response method for updateMergeTipo
 */
@CommandDescription(name="updateMergeTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeTipoResponse")
public interface UpdateMergeTipoResponse extends MessageHandler {

	void updateMergeTipoResponse(Tipo response);
	
	void updateMergeTipoResponseError(ErrorPayload error);

}
