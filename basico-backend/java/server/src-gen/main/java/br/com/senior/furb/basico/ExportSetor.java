/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportSetor", kind=CommandKind.Query, requestPrimitive="exportSetor", responsePrimitive="exportSetorResponse")
public interface ExportSetor extends MessageHandler {
    
    public ExportSetorOutput exportSetor(ExportSetorInput request);
    
}
