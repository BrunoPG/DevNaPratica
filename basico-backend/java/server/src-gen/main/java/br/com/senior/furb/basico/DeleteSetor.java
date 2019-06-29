/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Setor entity.
 */
@CommandDescription(name="deleteSetor", kind=CommandKind.Delete, requestPrimitive="deleteSetor", responsePrimitive="deleteSetorResponse")
public interface DeleteSetor extends MessageHandler {
    
    public void deleteSetor(Setor.Id id);
    
}
