/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Setor entity.
 */
@CommandDescription(name="updateSetor", kind=CommandKind.Update, requestPrimitive="updateSetor", responsePrimitive="updateSetorResponse")
public interface UpdateSetor extends MessageHandler {
    
    public Setor updateSetor(Setor toUpdate);
    
}
