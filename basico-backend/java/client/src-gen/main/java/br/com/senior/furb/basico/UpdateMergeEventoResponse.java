/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.Evento;

/**
 * Response method for updateMergeEvento
 */
@CommandDescription(name="updateMergeEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeEventoResponse")
public interface UpdateMergeEventoResponse extends MessageHandler {

	void updateMergeEventoResponse(Evento response);
	
	void updateMergeEventoResponseError(ErrorPayload error);

}
