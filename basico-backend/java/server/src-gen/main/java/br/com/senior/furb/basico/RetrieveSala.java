/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Sala entity.
 */
@CommandDescription(name="retrieveSala", kind=CommandKind.Retrieve, requestPrimitive="retrieveSala", responsePrimitive="retrieveSalaResponse")
public interface RetrieveSala extends MessageHandler {
    
    public Sala retrieveSala(Sala.Id id);
    
}
