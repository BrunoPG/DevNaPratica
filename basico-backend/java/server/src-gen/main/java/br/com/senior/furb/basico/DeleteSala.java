/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Sala entity.
 */
@CommandDescription(name="deleteSala", kind=CommandKind.Delete, requestPrimitive="deleteSala", responsePrimitive="deleteSalaResponse")
public interface DeleteSala extends MessageHandler {
    
    public void deleteSala(Sala.Id id);
    
}
