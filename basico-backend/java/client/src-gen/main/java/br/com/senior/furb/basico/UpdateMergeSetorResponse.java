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
 * Response method for updateMergeSetor
 */
@CommandDescription(name="updateMergeSetorResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeSetorResponse")
public interface UpdateMergeSetorResponse extends MessageHandler {

	void updateMergeSetorResponse(Setor response);
	
	void updateMergeSetorResponseError(ErrorPayload error);

}
