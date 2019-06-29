/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Sala entity.
 */
@CommandDescription(name="updateSala", kind=CommandKind.Update, requestPrimitive="updateSala", responsePrimitive="updateSalaResponse")
public interface UpdateSala extends MessageHandler {
    
    public Sala updateSala(Sala toUpdate);
    
}
