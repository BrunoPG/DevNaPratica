/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.furb.basico.ExportEventoOutput;

/**
 * Response method for exportEvento
 */
@CommandDescription(name="exportEventoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportEventoResponse")
public interface ExportEventoResponse extends MessageHandler {

	void exportEventoResponse(ExportEventoOutput response);
	
	void exportEventoResponseError(ErrorPayload error);

}
