/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Setor entity.
 */
@CommandDescription(name="createSetor", kind=CommandKind.Create, requestPrimitive="createSetor", responsePrimitive="createSetorResponse")
public interface CreateSetor extends MessageHandler {
    
    public Setor createSetor(Setor toCreate);
    
}
