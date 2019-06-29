/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Setor entity.
 */
@CommandDescription(name="retrieveSetor", kind=CommandKind.Retrieve, requestPrimitive="retrieveSetor", responsePrimitive="retrieveSetorResponse")
public interface RetrieveSetor extends MessageHandler {
    
    public Setor retrieveSetor(Setor.Id id);
    
}
