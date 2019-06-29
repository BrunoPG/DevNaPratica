/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportSala", kind=CommandKind.Query, requestPrimitive="exportSala", responsePrimitive="exportSalaResponse")
public interface ExportSala extends MessageHandler {
    
    public ExportSalaOutput exportSala(ExportSalaInput request);
    
}
