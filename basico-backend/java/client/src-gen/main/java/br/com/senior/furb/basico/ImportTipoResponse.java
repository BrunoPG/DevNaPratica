/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ImportTipoOutput;

/**
 * Response method for importTipo
 */
@CommandDescription(name="importTipoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importTipoResponse")
public interface ImportTipoResponse extends MessageHandler {

	void importTipoResponse(ImportTipoOutput response);
	
	void importTipoResponseError(ErrorPayload error);

}
