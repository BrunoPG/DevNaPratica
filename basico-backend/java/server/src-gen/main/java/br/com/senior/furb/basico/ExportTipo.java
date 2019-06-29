/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportTipo", kind=CommandKind.Query, requestPrimitive="exportTipo", responsePrimitive="exportTipoResponse")
public interface ExportTipo extends MessageHandler {
    
    public ExportTipoOutput exportTipo(ExportTipoInput request);
    
}
