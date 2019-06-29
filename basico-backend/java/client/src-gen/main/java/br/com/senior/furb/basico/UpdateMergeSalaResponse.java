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
 * Response method for updateMergeSala
 */
@CommandDescription(name="updateMergeSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeSalaResponse")
public interface UpdateMergeSalaResponse extends MessageHandler {

	void updateMergeSalaResponse(Sala response);
	
	void updateMergeSalaResponseError(ErrorPayload error);

}
