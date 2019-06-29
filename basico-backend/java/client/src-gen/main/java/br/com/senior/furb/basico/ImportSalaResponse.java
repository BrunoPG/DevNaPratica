/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportSalaOutput;

/**
 * Response method for importSala
 */
@CommandDescription(name="importSalaResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importSalaResponse")
public interface ImportSalaResponse extends MessageHandler {

	void importSalaResponse(ImportSalaOutput response);
	
	void importSalaResponseError(ErrorPayload error);

}
