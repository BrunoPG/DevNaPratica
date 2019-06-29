/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importSala", kind=CommandKind.Action, requestPrimitive="importSala", responsePrimitive="importSalaResponse")
public interface ImportSala extends MessageHandler {
    
    public ImportSalaOutput importSala(ImportSalaInput request);
    
}
