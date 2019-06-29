/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Setor;

/**
 * Response method for updateSetor
 */
@CommandDescription(name="updateSetorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateSetorResponse")
public interface UpdateSetorResponse extends MessageHandler {

	void updateSetorResponse(Setor response);
	
	void updateSetorResponseError(ErrorPayload error);

}
