/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importTipo", kind=CommandKind.Action, requestPrimitive="importTipo", responsePrimitive="importTipoResponse")
public interface ImportTipo extends MessageHandler {
    
    public ImportTipoOutput importTipo(ImportTipoInput request);
    
}
