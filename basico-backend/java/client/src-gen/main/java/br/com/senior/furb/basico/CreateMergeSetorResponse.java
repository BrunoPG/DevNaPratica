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
 * Response method for createMergeSetor
 */
@CommandDescription(name="createMergeSetorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeSetorResponse")
public interface CreateMergeSetorResponse extends MessageHandler {

	void createMergeSetorResponse(Setor response);
	
	void createMergeSetorResponseError(ErrorPayload error);

}
