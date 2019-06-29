/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Tipo entity.
 */
@CommandDescription(name="updateTipo", kind=CommandKind.Update, requestPrimitive="updateTipo", responsePrimitive="updateTipoResponse")
public interface UpdateTipo extends MessageHandler {
    
    public Tipo updateTipo(Tipo toUpdate);
    
}
