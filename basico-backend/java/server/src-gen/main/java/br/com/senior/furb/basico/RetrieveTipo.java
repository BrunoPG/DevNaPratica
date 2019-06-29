/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Tipo entity.
 */
@CommandDescription(name="retrieveTipo", kind=CommandKind.Retrieve, requestPrimitive="retrieveTipo", responsePrimitive="retrieveTipoResponse")
public interface RetrieveTipo extends MessageHandler {
    
    public Tipo retrieveTipo(Tipo.Id id);
    
}
