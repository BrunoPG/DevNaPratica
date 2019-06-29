/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Tipo entity.
 */
@CommandDescription(name="createTipo", kind=CommandKind.Create, requestPrimitive="createTipo", responsePrimitive="createTipoResponse")
public interface CreateTipo extends MessageHandler {
    
    public Tipo createTipo(Tipo toCreate);
    
}
